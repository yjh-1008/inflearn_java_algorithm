import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    static int total_sum;
    static String answer="NO";
    static boolean flag=false;
    static int N;
    static int arr[];
    public static void solution(int level,int sum){
        if(flag){return;}
        if(sum>(total_sum)/2){return;}
        if(level==N){
            if((total_sum-sum)==sum){
                answer="YES";
                flag=true;
            }
        }else{
            solution(level+1,sum+arr[level]);
            solution(level+1,sum);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        arr= new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
            total_sum+=arr[i];
        }
        boolean []chk=new boolean[N];
        solution(0,0);
        System.out.println(answer);
    }
}
