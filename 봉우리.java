import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static public void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       int [][] arr= new int[n+2][n+2];//가장자리는 0으로 초기화 되어있음
       for(int i=1;i<arr.length-1;i++){
           for(int j=1;j<arr.length-1;j++){
               arr[i][j]= sc.nextInt();
           }
       }
       int count=0;
        for(int i=1;i<arr.length-1;i++){
            for(int j=1;j<arr.length-1;j++){
                if(arr[i][j]>arr[i-1][j] && arr[i][j] > arr[i][j-1] && arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i][j+1]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
