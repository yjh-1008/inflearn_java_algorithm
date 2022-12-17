package DAY05.격자판최대합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, arr[][], answer=0,colSum[],rowSum[];
    public static void solution() {
        int diagonal = 0, rvDiagonal = 0, rMax =0, cMax = 0;
        for(int i=0;i<N;i++) {
            int cs = 0;
            diagonal += arr[i][i];
            rvDiagonal += arr[i][N-i-1];
            for(int j = 0 ;j<N; j++) {
                cs+= arr[i][j];
                rowSum[j] += arr[i][j];
            }
            colSum[i] = cs;
        }
        for(int i=0;i<N;i++) {
            if(rMax < rowSum[i]) rMax = rowSum[i];
            if(cMax < colSum[i]) cMax = colSum[i];
        }
        answer = Math.max(rMax, cMax);
        answer = Math.max(diagonal, Math.max(answer, rvDiagonal));

    }

    public static void main(String[] args)throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        colSum = new int[N];
        rowSum =  new int[N];
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ;j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solution();
        System.out.println(answer);
    }
}
