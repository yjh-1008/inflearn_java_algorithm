package DAY10.최대길연속부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, k,arr[], answer = Integer.MIN_VALUE;
    public static void solution() {
        int lt =0, rt=0, count=0;
        for(rt = 0 ;rt<N; rt++) {
            if(arr[rt] == 0) count++;
            if(count > k) {
                while(count > k ) {
                    if(arr[lt] == 0) count--;
                    lt++;
                }
            }
            answer = Math.max(answer, rt-lt+1);

        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[N];

        for(int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution();
        System.out.print(answer);
    }
}
