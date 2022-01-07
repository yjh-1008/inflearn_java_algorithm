import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    static int maxSum= Integer.MIN_VALUE;
    static int chk[];
    static void DFS(int L, int N, int[][] arr,int M){
        if(L==N) {
            int sum=0;
            int sum2=0;
            for(int i=0;i<N;i++){
                if(chk[i]==1){
                    sum+=arr[i][0];
                    sum2+=arr[i][1];
                }
            }
            if( sum2<=M && sum>maxSum){
                maxSum=sum;
            }
            return;
        }else{
            chk[L]=1;
            DFS(L+1,N,arr,M);
            chk[L]=0;
            DFS(L+1,N,arr,M);
        }

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int M= sc.nextInt();
        int arr[][]= new int[N][N];
        for(int i=0;i<N;i++){
            arr[i][0]=sc.nextInt();//점수
            arr[i][1]= sc.nextInt();//시간
        }
        chk=new int[N];
        DFS(0,N,arr,M);
        System.out.println(maxSum);
    }
}
