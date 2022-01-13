import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
class Main {
    static int chk[][] = new int[35][35];
    static int[] arr,answer,p;
    static boolean flag=false;
    static void solution(int n, int f,int sum,int L){
        if(flag){return;}
        if(L==n){
            System.out.println(sum);
            if(sum==f){
                for(int x:answer){
                    System.out.print(x+" ");
                }
                flag=true;
            }

        }
        else{
            for(int i=1;i<=n;i++){
                if(arr[i]==0){
                    arr[i]=1;
                    answer[L]=i;
                    solution(n,f,sum+(answer[L]*p[L]),L+1);
                    arr[i]=0;
                }
            }
        }
    }
    static int DFS(int n,int r){
        if(chk[n][r]!=0){return chk[n][r];}
        if(r==0 || n==r){return chk[n][r]=1;}
        else{
            return chk[n][r] = DFS(n-1,r-1)+DFS(n-1,r);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int f= sc.nextInt();
        arr = new int[n+1];
        answer = new int[n];
        p=new int[n];
        for(int i=0;i<n;i++){
            p[i]=DFS(n-1,i);
        }

        solution(n,f,0,0);
    }
}
