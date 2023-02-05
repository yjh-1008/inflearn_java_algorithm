package DAY14.올바른괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args)throws IOException {
        Stack<String> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split("");
        String answer="YES";
        for(String s: str) {
            if(s.equals("(")) stack.add(s);
            else {
                if(stack.isEmpty()){
                    answer="NO";
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()) answer="NO";
        System.out.print(answer);
    }
}
