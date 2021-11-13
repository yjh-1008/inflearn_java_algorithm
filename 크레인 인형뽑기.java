import java.io.*;
import java.util.*;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int arr1[][]=  new int[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr1[i][j]= sc.nextInt();
            }
        }
        int n= sc.nextInt();
        int[] arr2=new int[n];
        //n이 열
        for(int i=0;i<n;i++){
            arr2[i]= sc.nextInt();
        }
        int answer=0;
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
            int temp=arr2[i]-1;
            for(int j=0;j<N;j++){
               if(arr1[j][temp]!=0){
                   if(!st.isEmpty()) {
                       if (arr1[j][temp] == st.peek()) {
                           answer += 2;
                           st.pop();
                       } else {
                           st.push(arr1[j][temp]);
                       }
                       arr1[j][temp] = 0;
                       break;
                   }else{
                       st.push(arr1[j][temp]);
                       arr1[j][temp] = 0;
                       break;
                   }
               }

            }
        }
        System.out.print(answer);
    }
}