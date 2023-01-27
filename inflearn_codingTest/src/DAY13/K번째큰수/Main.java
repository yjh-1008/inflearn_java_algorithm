package DAY13.K번째큰수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    static int N, k, arr[];
    public static int solution() {
        int answer=-1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int i=0;i<N;i++) {
            for(int j=i+1;j<N;j++) {
                for(int t=j+1;t<N;t++) {
                    set.add(arr[i]+arr[j]+arr[t]);
                }
            }
        }
        int count =0;
        for(int s: set) {
            count++;
            if(count == k) return s;
        }

        return answer;
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
        System.out.print(solution());
    }
}
