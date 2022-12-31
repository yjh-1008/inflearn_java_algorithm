package DAY08.공통원소구하기;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N, arr1[], arr2[];

    public static void solution(int len1, int len2)throws IOException {
        int p1=0, p2=0;
        while(p1 < len1 && p2 < len2) {
            if(arr1[p1] == arr2[p2]) {
                bw.write(arr1[p1]+" ");
                p1 += 1;
                p2 += 1;
            } else if(arr1[p1] > arr2[p2]) {
                p2 += 1;
            } else if(arr1[p1] < arr2[p2]){
                p1 += 1;
            }
        }

        bw.flush();
    }

    public static void main(String[] args)throws IOException {
        N = Integer.parseInt(br.readLine());
        arr1 = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);
        N = Integer.parseInt(br.readLine());
        arr2 = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr2);
        solution(arr1.length, arr2.length);
    }
}
