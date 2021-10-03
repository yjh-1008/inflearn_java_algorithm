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
        String str=sc.next();
        str+=" ";
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=0;i<str.length()-1;i++){
           if(str.charAt(i)==str.charAt(i+1)){
               count++;
           }else{
               sb.append(str.charAt(i));
               if(count>1){
                   sb.append(count);
                   count=1;
               }
           }
        }
        System.out.print(sb.toString());
    }
}

