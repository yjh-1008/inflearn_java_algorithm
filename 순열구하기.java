import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
class Main {
    static int[] arr,ch,answer;
    public static void DFS(int L, int M){
        if(L==M){
            for(int x:answer){System.out.print(x+" ");}
            System.out.println();
        }else{
            for(int i=0;i<arr.length;i++){
                if(ch[i]==0){
                    answer[L]= arr[i];
                    ch[i]=1;
                    DFS(L+1,M);
                    ch[i]=0;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        ch= new int[N];
        answer= new int[M];
        DFS(0,M);
    }
}
