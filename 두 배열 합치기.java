import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int M=sc.nextInt();
        int arr1[]=new int[M];
        for(int i=0;i<M;i++){
            arr1[i]=sc.nextInt();
        }
        int N=sc.nextInt();
        int arr2[]=new int[N];
        for(int i=0;i<N;i++){
            arr2[i]=sc.nextInt();
        }
        ArrayList<Integer> answer=new ArrayList<>();
        int i=0,j=0,count=0;
        while(i<M && j<N){
            if(i<=M-1 && j<=N-1) {
                if (arr1[i] < arr2[j]) {
                    answer.add(arr1[i++]);

                } else if (arr1[i] > arr2[j]) {
                    answer.add(arr2[j++]);
                } else {
                    answer.add(arr1[i++]);
                    answer.add(arr2[j++]);
                }
                continue;
            }


        }
        if(i==M && j<N){
            while(j<N){
                answer.add(arr2[j++]);
            }
        }
        if(j==N && i<M){
            while(i<M){
                answer.add(arr1[i++]);
            }
        }
        for(int x:answer){
            System.out.print(x+" ");
        }
    }
}

