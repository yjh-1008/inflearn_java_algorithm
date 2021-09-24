import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static public void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        //sc.next는 공백으로 구분 sc.nextLine은 \n로 구분.
        String s= sc.next();
        String[] arr = s.split(" ");
        int size=0;
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(size<arr[i].length()){
                size=arr[i].length();
                idx=i;
            }
        }
        System.out.println(arr[idx]);
    }
}
