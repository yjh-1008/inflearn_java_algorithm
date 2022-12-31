package DAY07.두배열합치기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int p1=0,p2=0, arr1[], arr2[],N;
    public static void solution(int len1, int len2)throws IOException {
        if(p1 == len1) {
            for(int l = p2; l<len2; l++) {
                bw.write(arr2[l]+" ");
            }
        } else if(p2 == len2) {
            System.out.println("here"+p1+len1);
            for(int l = p1; l<len1; l++) {
                System.out.println(arr1[l]);
                bw.write(arr1[l]+" ");
            }
        } else {
            if(arr1[p1] < arr2[p2]) {
                bw.write(arr1[p1++]+" ");
            } else if(arr1[p1] > arr2[p2]) {
                bw.write(arr2[p2++]+" ");
            } else  {
                bw.write(arr1[p1++]+" ");
                bw.write(arr2[p2++]+" ");
            }
            solution(len1, len2);
        }

    }

    public static void main(String[] args)throws IOException {
        N = Integer.parseInt(br.readLine());
        arr1 = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        N = Integer.parseInt(br.readLine());
        arr2 = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr1.length, arr2.length);
        bw.flush();
    }
}
