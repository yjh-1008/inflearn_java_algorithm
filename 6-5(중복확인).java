import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int arr[] = new int [N];
        String answer="U";
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<N-1;i++){
            for(int j=N-1;j>i+1;j--){
                if(arr[i]==arr[j]){
                    answer="D";
                    break;
                }
            }
            if(answer.equals("D")){
                break;
            }
        }
        System.out.print(answer);
    }
}