package DAY08.최대매출구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, K, arr[], answer=Integer.MIN_VALUE, sum =0;
    public static void solution() {
        int lt=0, rt=K;
        while(rt < N) {
            sum -= arr[lt++];
            sum += arr[rt++];
            if(answer < sum) answer = sum;
        }
    }


    public static void main(String[] args)throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for(int i=0; i<N; i++ ){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<K; i++) {
            sum += arr[i];
            if(answer < sum) answer = sum;
        }
        solution();
        System.out.println(answer);
    }
}
