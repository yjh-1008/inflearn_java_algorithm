import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        char[] preSubject= sc.nextLine().toCharArray();
        char[] subject= sc.nextLine().toCharArray();
        String answer="YES";
        for(int i=0;i< preSubject.length;i++){
            queue.add(preSubject[i]);
        }
        for(int i=0;i<subject.length;i++){
            if(queue.contains(subject[i])){
                if(queue.peek()!=subject[i]) {
                    answer = "NO";
                }else{
                    queue.poll();
                }
            }
        }
        if(!queue.isEmpty()){
            answer="NO";
        }
        System.out.println(answer);
    }
}
