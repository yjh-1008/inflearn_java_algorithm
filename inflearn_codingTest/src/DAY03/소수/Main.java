package DAY03.소수;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, answer=0, MAX_ARR_LEN = 200001;
    static boolean[] arr;
    static public void solution() {
        int tmp;
        for(int i=2; i*i <= N ;i++) {
            if(!arr[i]) {
                for (int j = i * i; j <= N ; j += i) {
                    arr[j] = true;
                }
            }
        }

        for(int i=2;i<=N;i++){
            if(!arr[i]) answer++;
        }
    }

    public static void main(String[] args)throws Exception {
        N = Integer.parseInt(br.readLine());
        arr = new boolean[MAX_ARR_LEN];
        solution();
        System.out.print(answer);
    }
}
