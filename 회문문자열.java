import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static public void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        String s=sc.next().toLowerCase();
        char[] arr= s.toCharArray();

        String answer="YES";
        int lf=0,rf=arr.length-1;
        if(arr.length%2==0) {
            while (lf < rf) {
                if (arr[lf] != arr[rf]) {
                    answer = "NO";
                    break;
                }
                lf++;
                rf--;
            }
        }else{
            while (lf != rf) {
                if (arr[lf] != arr[rf]) {
                    answer = "NO";
                    break;
                }
                lf++;
                rf--;
            }
        }
        System.out.print(answer);
    }
}
