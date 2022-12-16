package DAY04.점수계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int answer=0,N;
    static String arr[];
    public static int solution() {
        int count = 1;
        for(String s : arr) {
            if(s.equals("1")) {
                answer+=count;
                count++;
            }
            else count=1;
        }
        return answer;
    }

    public static void main(String[] args)throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new String[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++) {
            arr[i] = st.nextToken();
        }

        System.out.print(solution());
    }
}
