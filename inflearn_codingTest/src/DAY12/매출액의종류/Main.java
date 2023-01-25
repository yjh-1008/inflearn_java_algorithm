package DAY12.매출액의종류;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static int N,k,answer=0, arr[];
    public static void solution(){
        HashMap<Integer, Integer> hash = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int rt=0,lt=0; rt<N; rt++) {
            if(rt < k-1) {
                hash.put(arr[rt],hash.getOrDefault(arr[rt],0)+1);
            }
            else {
                hash.put(arr[rt], hash.getOrDefault(arr[rt],0)+1);
                sb.append(hash.size());
                sb.append(" ");
                //1이면 바로 지움
                hash.put(arr[lt], hash.get(arr[lt])-1);
                if(hash.get(arr[lt]) == 0) hash.remove(arr[lt]);
                lt++;

            }
        }
        System.out.println(sb);
    }


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution();
        br.close();
    }
}
