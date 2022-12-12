package DAY03.뒤집은소수;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N;
    static String arr[];
    static boolean isDemical[] = new boolean[100001];

    public static void demical() {
        isDemical[0] = isDemical[1] = true;
        for(int i=2; i*i <= 100000 ; i++) {
            if(!isDemical[i]) {
                for (int j = i * i; j <= 100000; j += i) isDemical[j] = true;
            }
        }
    }
    public static void solution() throws IOException {
        char[] reverse;
        int idx;
        for(String s : arr) {
            reverse = new char[s.length()];
            idx=s.length()-1;
            for(char c : s.toCharArray()) reverse[idx--] = c;
            int answer = Integer.parseInt(String.valueOf(reverse));
            if(!isDemical[answer]) bw.write(answer+" ");
        }
    }

    public static void main(String[] args)throws Exception {
        N = Integer.parseInt(br.readLine());
        arr = new String[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) arr[i] = st.nextToken();

        demical();
        solution();
        bw.flush();
        br.close();
        bw.close();
    }
}
