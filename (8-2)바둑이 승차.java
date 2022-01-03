import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    static int answer=0;
    static int C;
    static int N;
    public static void DFS(int l,int[] arr,int sum){
        if(sum>=C){
            return;
        }
        if(l==N){
            answer= Math.max(answer,sum);
        }else{
            DFS(l+1,arr,sum+arr[l]);
            DFS(l+1,arr,sum);
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        C= sc.nextInt();
        N= sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        boolean []chk=new boolean[N];
        DFS(0,arr,0);
        System.out.println(answer);
    }
}
