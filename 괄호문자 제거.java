import java.io.*;
import java.util.*;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr= sc.nextLine().toCharArray();
        Stack<Character> stack= new Stack<>();
        boolean chk=false;
        StringBuilder sb= new StringBuilder();
        for(char x:arr){
                if (x == '(') {
                    chk=true;
                    stack.push(x);
                } else if (x == ')') {
                    stack.pop();
                    if(stack.isEmpty()){
                        chk=false;
                    }
                }else{
                    if(!chk){
                        sb.append(x);
                    }
                }
        }
        System.out.print(sb.toString());
    }
}