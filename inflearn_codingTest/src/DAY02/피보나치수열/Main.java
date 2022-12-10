package DAY02.피보나치수열;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    public static void fibo(int a, int b, int count)throws IOException {
        bw.write(" "+b);
        if(count == N) {
            bw.flush();
            bw.close();
            br.close();
            return;
        }
        fibo(b, a+b, count+1);
    }

    public static void main(String[] args)throws IOException {
        //1) 피보나키 수열을 출력한다.
        N = Integer.parseInt(br.readLine());
        bw.write("1");
        fibo(1,1,2);
    }
}
