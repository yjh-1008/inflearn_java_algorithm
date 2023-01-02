package DAY09.연속부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N,M, arr[], answer=0;
    public static void solution() {
        int lt =0, rt=0, sum=0;
        while(lt < N) {
            if(sum < M && rt < N) {
                sum += arr[rt++];
            } else {
                sum -= arr[lt++];
            }
            if(sum == M) answer++;
        }
    }

    public static void main(String[] args)throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution();
        System.out.print(answer);
    }
}
