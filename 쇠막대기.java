import java.io.*;
import java.util.*;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch= sc.nextLine().toCharArray();
        Stack<Character> st= new Stack<>();
        int answer=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                st.push(ch[i]);
            }
            if(ch[i]==')'){
                if(ch[i-1]=='('){
                    st.pop();
                    answer+=st.size();
                }else{
                    st.pop();
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}