import java.io.*;
import java.util.*;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[]= sc.nextLine().toCharArray();
        Stack<Integer> st= new Stack<>();
        st.push(arr[0]-'0');
        int count=1;
        while(count<arr.length){
            int temp1=0, temp2=0,cal=0;
            if(Character.isDigit(arr[count])){
                st.push(arr[count++]-'0');
            }else{
                temp1=st.pop();
                temp2=st.pop();
                if(arr[count]=='+'){
                    cal=temp1+temp2;
                }else if(arr[count]=='-'){
                    cal =temp2-temp1;
                }else if(arr[count]=='*'){
                    cal=temp2*temp1;
                }else{
                    cal= temp2/temp1;
                }
                count++;
                st.push(cal);
            }
        }
        System.out.print(st.peek());
    }
}