package DAY06.멘토링;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N,M, arr[][], answer=0;
    public static void solution() {
        //i번째 학생이 n번의 시험에서 항상 J번째 학생보다 등수가 높다면 카운트
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=N;j++){
                int cnt = 0;
                for(int n=0;n<M;n++) {
                    int pi=0,pj=0;
                    for(int s=0; s<N;s++){
                        if(arr[n][s] == i) pi = s;
                        if(arr[n][s] == j) pj = s;
                    }
                    if(pi > pj) cnt++;
                }
                if(cnt == M) answer++;
            }
        }
    }

    public static void main(String[] args)throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M][N];
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution();
        System.out.print(answer);
    }
}
