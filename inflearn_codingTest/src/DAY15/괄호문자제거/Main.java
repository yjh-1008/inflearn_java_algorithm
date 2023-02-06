package DAY15.괄호문자제거;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        String answer="";
        Stack<String> stack = new Stack<>();
        for(String s: str) {
            if(s.equals("(")) stack.push(s);
            else if(s.equals(")")) stack.pop();
            else {
                if (stack.isEmpty()) answer += s;
            }
        }

        System.out.print(answer);
    }
}
