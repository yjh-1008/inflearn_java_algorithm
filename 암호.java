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
        String str= sc.next();
        int temp=0;
        String code;
        StringBuilder sb= new StringBuilder();
        for(int i=1;i<=n;i++){
            code="";
            String te=str.substring(temp,7*i);
            temp=7*i;
            for(int j=0;j<7;j++){
                if(te.charAt(j)=='#'){
                    code+="1";
                }else {
                    code += "0";
                }
            }
            sb.append(Character.toChars((Integer.parseInt(code,2))));
        }
        System.out.print(sb.toString());
    }
}

