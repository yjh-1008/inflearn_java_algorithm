import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static int arr[]= {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
    static public void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        String c= sc.next().toLowerCase(Locale.ROOT);
        s=s.toLowerCase();
        int answer=0;
        /*for(int i=0;i<s.length();i++){
            if(c.charAt(0)==s.charAt(i)){
                answer++;
            }
        }*/
        //toCharArray()는 문자열을 배열로 생
        for(char x:s.toCharArray()){
            if(x==c.charAt(0)){
                answer++;
            }
        }
        System.out.print(answer);
    }
}
