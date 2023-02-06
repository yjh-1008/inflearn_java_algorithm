package DAY15.크레인인형뽑기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int arr[][], moves[];
    public static int chkBomb(Stack<Integer> stack, int num) {
        if(stack.peek() == num) {
            stack.pop();
            return 2;
        }else {
            stack.push(num);
        }
        return 0;
    }

    public static void solution() {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<moves.length; i++) {
            int row = moves[i]-1;
            for(int j=0; j<arr.length; j++) {
                if(arr[j][row] != 0) {
                   if(!stack.isEmpty())answer += chkBomb(stack, arr[j][row]);
                   else stack.push(arr[j][row]);
                   arr[j][row] = 0;
                   break;
                }
            }
        }
        System.out.print(answer);
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n ;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        moves = new int[m];
        for(int i=0; i<m; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }
}
