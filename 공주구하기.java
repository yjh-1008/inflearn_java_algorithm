import java.io.*;
import java.util.*;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K= sc.nextInt();
        Queue<Integer> qu= new LinkedList<>();
        for(int i=1;i<=N;i++){
            qu.add(i);
        }
        int temp=1;
        while(qu.size()>1){
            if(temp!=K){
                qu.offer(qu.poll());
                temp++;
            }else{
                qu.poll();
                temp=1;
            }
        }
        System.out.println(qu.peek());
    }
}