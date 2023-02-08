package DAY17.교육과정설계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void solution(String[] p, Queue<String> q) {
        String answer="YES";
        for(String s: p) {
            if(q.contains(s)) {
                if(q.peek().equals(s)) {
                    q.poll();
                } else {
                    answer="NO";
                    break;
                }
            }
        }
        if(!q.isEmpty()) answer="NO";
        System.out.print(answer);
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sequence[] = br.readLine().split("");
        Queue<String> q = new LinkedList<>();

        for(String s: sequence) q.offer(s);

        String plan[] = br.readLine().split("");

        solution(plan, q);
    }
}
