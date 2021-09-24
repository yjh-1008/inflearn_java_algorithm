import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static public void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        //sc.next는 공백으로 구분 sc.nextLine은 \n로 구분.
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            String s= sc.next();
            String temp=new String();
            for(int j=s.length()-1;j>=0;j--){
                temp+=s.charAt(j);
            }
            System.out.println(temp);
        }
    }
}
