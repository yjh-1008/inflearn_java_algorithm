import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    static int[] chk;
    public static void DFS(int L,int N){
        if(L==N+1){
            String tmp="";
            for(int i=1;i<=N;i++){
                if(chk[i]==1){
                    tmp+=(i+" ");
                }
            }
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }
        }else{
            chk[L]=1;
            DFS(L+1,N);
            chk[L]=0;
            DFS(L+1,N);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        StringBuilder sb = new StringBuilder();
        chk= new int[N+1];
        DFS(1,N);
        /*
             1
          2     3
        4   5  6  7
        */
    }
}
