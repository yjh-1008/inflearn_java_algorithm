import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    public static void solution(int N){
        if(N==0){return;}
        else{
            solution(N/2);
            System.out.print(N%2);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        solution(N);
    }
}
