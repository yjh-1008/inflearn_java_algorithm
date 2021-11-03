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
        StringBuilder sb=new StringBuilder();
        int[] N= new int[n];
        int[] M=new int[n];
        for(int i=0;i<N.length;i++){
            N[i]=sc.nextInt();
        }
        for(int i=0;i<N.length;i++){
            M[i]=sc.nextInt();
        }
       for(int i=0;i<n;i++){
           if(N[i]==1){
               //1 A가 이기는 경우
               if(M[i]==3){
                   sb.append("A"+"\n");
               }else if(M[i]==2){
                   sb.append("B"+"\n");
               }else{
                   sb.append("D"+"\n");
               }
           }else if(N[i]==2){
               if(M[i]==1){
                   sb.append("A"+"\n");
               }else if(M[i]==3){
                   sb.append("B"+"\n");
               }else{
                   sb.append("D"+"\n");
               }
           }else{
               if(M[i]==2){
                   sb.append("A"+"\n");
               }else if(M[i]==1){
                   sb.append("B"+"\n");
               }else{
                   sb.append("D"+"\n");
               }
           }
       }
       System.out.println(sb.toString());
    }
}

