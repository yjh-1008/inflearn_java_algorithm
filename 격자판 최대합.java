import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static public void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       int [][] arr= new int[n][n];
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length;j++){
               arr[i][j]= sc.nextInt();
           }
       }
       int rowMaxSum=0;
       int colMaxSum=0;
       int diagMaxSum=0;

       int finalMaxSum=0;//끝점의 대각선 합.
       for(int i=0;i<arr.length;i++){
           //대각선은 시작과 끝점에서만 진행됨.
           int rowtemp=0;
           int coltemp=0;
           diagMaxSum+=arr[i][i];
           finalMaxSum+=arr[arr.length-1-i][arr.length-1-i];
           for(int j=0;j<arr.length;j++){
               rowtemp+=arr[i][j];
               coltemp+=arr[j][i];
           }
           if(rowMaxSum<rowtemp){
               rowMaxSum=rowtemp;
           }
           if(colMaxSum<coltemp){
               colMaxSum=coltemp;
           }
       }
       System.out.println(Math.max(Math.max(rowMaxSum,colMaxSum),Math.max(diagMaxSum,finalMaxSum)));

    }
}
