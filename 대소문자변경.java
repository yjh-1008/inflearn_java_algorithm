import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static int arr[]= {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
    static public void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        StringBuilder answer= new StringBuilder(new String());
        for(char x:s.toCharArray()){
            if(Character.isLowerCase(x)){
                answer.append(Character.toUpperCase(x));
            }else{
                answer.append(Character.toLowerCase(x));
            }
        }
        System.out.print(answer);
    }
}
