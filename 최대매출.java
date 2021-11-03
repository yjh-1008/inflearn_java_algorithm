import java.io.*;
import java.util.*;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        int answer=0;
        int sum=0;
        for(int i=0;i<M;i++){
            sum+=arr[i];
        }
        answer=sum;
        for(int i=M;i<N;i++){
            sum+=arr[i]-arr[i-M];
            answer=Math.max(sum,answer);
        }
        System.out.print(answer);
    }
}