import java.io.*;
import java.util.*;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr= sc.nextLine().toCharArray();
        Stack<Character> stack= new Stack<>();
        String answer="YES";
        for(char x:arr){
            if(x=='('){
                stack.push(x);
            }else if(x==')'){
                if(stack.isEmpty()){
                    answer="NO";
                    break;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            answer="NO";
        }
        System.out.print(answer);
    }
}