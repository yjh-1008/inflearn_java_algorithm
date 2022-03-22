import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Main {
    static int chk[];
    static String answer="NO";
    public static void solution(int N, int arr[][],int s, int d){
       //System.out.println(s+"    "+d);
        if(s==d){
            answer="YES";
            return;
        }

        chk[s]=1;
        for(int i=1;i<=N;i++){
            if(chk[i]!=1 && arr[s][i]==1){
                chk[i]=1;
                solution(N,arr,i,d);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        int arr[][]= new int[N+1][N+1];
        chk=new int[N+1];
        for(int i=0;i<M;i++){
            int friend = sc.nextInt();
            int toFriend = sc.nextInt();
            arr[friend][toFriend] = 1;
            arr[toFriend][friend] = 1;
        }
        int s=sc.nextInt();
        int d = sc.nextInt();

       solution(N,arr,s,d);
       System.out.print(answer);
    }
}
