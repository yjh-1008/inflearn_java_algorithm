import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String answer="";
        String[] str = sc.next().split("");
        for(int i=0;i<str.length;i++){
           if(!answer.contains(str[i])){
               answer+=str[i];
           }
        }
        System.out.println(answer);
    }
}