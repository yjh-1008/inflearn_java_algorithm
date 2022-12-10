package DAY02.가위바위보;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main  {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N, A[], B[];
    static public void game()throws Exception {
        for(int g = 0; g < N; g++) {
            switch(A[g]) {
                case 1:
                    if(B[g] == 1) bw.write("D\n");
                    else if(B[g] == 2) bw.write("B\n");
                    else bw.write("A\n");
                    break;
                case 2:
                    if(B[g] == 1) bw.write("A\n");
                    else if(B[g] == 2) bw.write("D\n");
                    else bw.write("B\n");
                    break;
                case 3:
                    if(B[g] == 1) bw.write("B\n");
                    else if(B[g] == 2) bw.write("A\n");
                    else bw.write("D\n");
                    break;
            }
        }
    }

    public static void main(String[] args)throws Exception {
        //A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고,
        // B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
        //1:가위, 2:바위, 3:보
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        B = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int repeat = 0 ;repeat < N; repeat++) {
            A[repeat] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int repeat = 0 ;repeat < N; repeat++) {
            B[repeat] = Integer.parseInt(st.nextToken());
        }

        game();
        bw.flush();

    }
}
