package DAY19.선택정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] solution(int[] arr, int n) {
        int idx;
        for(int i=0;i<n;i++) {
            idx=i;
            for(int j=i+1;j<n;j++) {
                if(arr[j] < arr[idx]) idx = j;
            }
            if(idx != i) {
                int tmp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = tmp;
            }
        }
        return arr;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int answer[];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        answer = solution(arr, n);
        for(int a: answer){
            System.out.print(a+" ");
        }
    }
}
