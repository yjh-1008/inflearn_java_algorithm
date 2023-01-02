package DAY09.연속된자연수의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void solution(int N, int answer) {
        for(int lt=1; lt<=N/2; lt++) {
            int sum = lt;
            int rt = lt+1;
            while(sum < N) {
                sum += rt++;
            }
            if(sum == N)answer++;
        }
        System.out.println(answer);
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        solution(N,0);
    }
}
