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
       Scanner sc= new Scanner(System.in);
       boolean[] arr= new boolean[sc.nextInt()+1];
       for(int i=2;i<arr.length;i++){
           if(!arr[i]){

               int count=2;
               int temp=count*i;
               while(temp<=arr.length-1){
                   arr[temp]=true;
                   temp=i*(++count);

               }
           }
       }
       int count=0;
       for(int i=2;i<arr.length;i++){
           if(!arr[i]){
               System.out.print(i+" ");
               count++;
           }
       }
       System.out.print(count);
    }
}

