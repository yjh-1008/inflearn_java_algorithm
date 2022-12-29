package DAY06.임시반장정하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, answer=0, arr[][], max = Integer.MIN_VALUE;
    static HashMap<Integer, Integer> hash = new HashMap<>();
    public static void solution() {
        for(int n=1; n<= N; n++){//반복횟수
            int cnt = 0;
            for(int i = 1; i <= N; i++) {//학년
                for(int j=1; j<=5; j++) {//학생
                    //n번째 학생이 i학년에서 j학생과 같은 학번인 경우 카운트
                    if(arr[n][j] == arr[i][j]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max ) {
                max = cnt;
                answer = n;
            }
        }
    }

    public static void main(String[] args)throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1][6];

        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            hash.put(i, 0);
            for(int j=1; j<=5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solution();
        System.out.println(answer);
    }
}
