import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int answer[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    count++;
                }
            }
            answer[i]=count;
        }
        for(int x: answer){
            System.out.print(x+" ");
        }
    }
}

