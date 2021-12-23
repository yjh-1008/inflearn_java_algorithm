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
        int S= sc.nextInt();
        int N= sc.nextInt();
        int arr[]= new int[S];
        int insert[]= new int[N];

        for(int i=0;i<N;i++){
            insert[i]= sc.nextInt();
        }

        for(int i=0;i<N;i++){
            int tmp= insert[i];
            int pos=-1;
            for(int j=0;j<S;j++){
                if(tmp==arr[j]){
                    pos=j;
                }
            }
            if(pos==-1){
                for(int j=S-1;j>=1;j--){
                    arr[j]=arr[j-1];
                }
                arr[0]=tmp;
            }else{
                for(int j=pos;j>=1;j--){
                    arr[j]=arr[j-1];
                }
                arr[0]=tmp;
            }
        }
        for(int x: arr){
            System.out.print(x+" ");
        }

    }
}
