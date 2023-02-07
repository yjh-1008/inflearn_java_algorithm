package DAY16.쇠막대기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static Stack<String> stack = new Stack<>();
    static String str[];
    static int answer=0, stick=0;
    public static void solution() {
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(")")) {
                stack.pop();
                if(str[i-1].equals("(")) answer+= stack.size();
                else answer++;
            } else {
                stack.push(str[i]);
            }
        }

        System.out.print(answer);
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split("");

        solution();
    }
}
