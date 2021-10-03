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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int MAX=0;
        StringBuilder sb= new StringBuilder();
        sb.append(arr[0]+" ");
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                sb.append(arr[i]+" ");
            }
        }
        System.out.println(sb.toString());
    }
}

