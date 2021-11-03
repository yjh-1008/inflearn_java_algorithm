import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.ArrayList;
public class Main {
    public static int cal(int []temp,int i){
        if(i==0 || i==1){
            return 1;
        }
        return temp[i]=temp[i-1]+temp[i-2];
    }
    public static int solution(int[] arr){
        int temp[]= arr;
        temp[0]=1;
        temp[1]=1;
        if(arr.length<3){
            return 1;
        }
        for(int i=2;i<arr.length;i++){
            temp[i]=cal(temp,i);
        }
        return temp[temp.length-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        int[] fibo=new int[n];
        solution(fibo);
        for(int i=0;i< fibo.length;i++){
            System.out.print(fibo[i]+" ");
        }
    }
}

