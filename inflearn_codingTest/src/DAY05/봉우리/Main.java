package DAY05.봉우리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, arr[][] ,answer=0;
    static int toX[] = {0,0,-1,1}, toY[] = {1,-1,0,0};
    static boolean[][] peak;
    public static void solution() {
        for(int i=0; i<N; i++) {
            for(int j=0;j<N; j++) {
                boolean chk = false;
                for(int k=0;k<4;k++) {
                    int moveY = j-toX[k];
                    int moveX = i - toY[k];
                    if(moveX >= 0 && moveY >= 0 && moveX < N && moveY < N) {
                        if(arr[moveX][moveY] >= arr[i][j]){
                            chk = true;
                            break;
                        }
                    }
                }
                if(!chk) {
                    peak[i][j] = true;
                    answer++;
                }
            }
        }
    }
    public static void main(String[] args)throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        peak = new boolean[N][N];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution();
        System.out.print(answer);
    }
}
