package DAY18.응급실;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class Person{
        int idx;
        int weight;
        Person(int idx, int weight) {
            this.idx=idx;
            this.weight=weight;
        }
    }
    static Queue<Person> q = new LinkedList<>();
    static int answer=1;
    public static void solution(int m) {
        while(!q.isEmpty()){
            Person p = q.poll();
            for(Person person: q) {
                if(p.weight < person.weight){
                    q.offer(p);
                    p=null;
                    break;
                }
            }

            if(p!=null) {
                if(p.idx == m) {
                    System.out.print(answer);
                }else {
                    answer++;
                }
            }
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            q.offer(new Person(i, Integer.parseInt(st.nextToken())));
        }

        solution(m);

    }
}
