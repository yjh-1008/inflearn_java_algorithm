import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    static int count=1;;
    public static void solution(int N){
        if(count>N){
            return;
        }
        System.out.print((count++)+" ");
        solution(N);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        solution(N);
    }
}
