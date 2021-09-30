import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sb= sc.next();
        char[] s=sb.toCharArray();
        int lt=0;
        int rt=s.length-1;
        while(lt<rt){
            char c;
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            }
            else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else {
                c = s[lt];
                s[lt] = s[rt];
                s[rt] = c;
                lt++;
                rt--;
            }
        }
        System.out.print(String.valueOf(s));
    }
}