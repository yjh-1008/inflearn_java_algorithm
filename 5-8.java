import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static class Person{
        int idx;
        int danger;
        public Person(int idx, int danger){
            this.idx=idx;
            this.danger=danger;
        }
    }
    public static void main(String[] args) {
        Queue<Person> qu= new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        for(int i=0;i<N;i++){
            int temp=sc.nextInt();
            qu.add(new Person(i,temp));
        }
        int count=1;//인원 세기
        boolean chk;//더 큰 위험도가 있나 검사
        while(!qu.isEmpty()){
            chk=false;
            Person p= qu.poll();
            for(Person x: qu){
                if(p.danger<x.danger){
                    qu.add(p);
                    chk=true;
                    break;
                }
            }
            if(!chk && p.idx==M){
                break;
            }else if(!chk && p.idx!=M){
                count++;
            }

        }
        System.out.println(count);

    }
}
