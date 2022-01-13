import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
class Main {
    static int N,M;
    static int[] chk,answer,arr;

    static void DFS(int L){
        count++;
        if(L==M){
            for(int x:answer){
                System.out.print(x+" ");
            }
            System.out.println();
        }else{
            for(int i=L+1;i<=N;i++){
                if(chk[i]==0){
                    chk[i]=1;
                    answer[L]=arr[i];
                    DFS(L+1);
                    chk[i]=0;
                }
            }
        }

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        N= sc.nextInt();
        M= sc.nextInt();
        chk= new int[N+1];
        arr= new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i]=i;
        }
        answer =new int[M];
        DFS(0);
    }
}
