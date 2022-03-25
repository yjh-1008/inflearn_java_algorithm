import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Main {
    static int dy[];
    public static void solution(int n){
        for(int i=2;i<=n;i++){
            dy[i]= dy[i-2]+dy[i-1];
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n+1];
        dy[0]=1;
        dy[1]=2;
        solution(n);
       System.out.print(dy[n]);
    }
}
