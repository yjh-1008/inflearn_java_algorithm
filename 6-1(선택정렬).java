import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int[] temp(int [] arr,int i,int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int arr[]= new int[N];
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(arr[i]<arr[j]){
                    arr =temp(arr,i,j);
                }
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
