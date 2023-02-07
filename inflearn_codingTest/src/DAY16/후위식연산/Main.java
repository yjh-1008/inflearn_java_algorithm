package DAY16.후위식연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char str[] = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();
        int a,b;
        for(char c: str) {
            if(Character.isDigit(c)) stack.add(Character.getNumericValue(c));
            else {
                switch(c) {
                    case '+' :
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(a+b);
                        break;
                    case '-' :
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b-a);
                        break;
                    case '*' :
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b*a);
                        break;
                    case '/' :
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b/a);
                        break;
                }
            }
        }
        System.out.print(stack.peek());
    }
}
