import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    static void fibo(int a,int b, int N, int count){
        if(N==count){return;}
        System.out.println(b);
        fibo(b,a+b,N,++count);

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        fibo(0,1,N,0);
    }
    /*
    	1 1 1 0
        1 1 1 0
        0 0 0 1
        0 0 0 1
        0 0 0 1
        0 0 0 1
     */
}
