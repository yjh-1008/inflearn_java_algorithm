package DAY01.큰수출력하기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    //문제 : N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, numberList[];
    public static void main(String[] args)throws Exception {
        N = Integer.parseInt(br.readLine());
        numberList = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int n = 0 ; n < N; n++) {
            numberList[n] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(numberList[0]));
        //for문으로 앞의 숫자와 비교하여 더 큰 값은 bw에 넣는다.
        for(int n = 1; n < N; n++) {
            if(numberList[n] > numberList[n-1]) bw.write(" "+numberList[n]);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
