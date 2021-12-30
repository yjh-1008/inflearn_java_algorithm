import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    static int[] MOVE={1,-1,5};
    static int solution(int S, int D,int chkarr[]){
        int answer=0;
        Queue<Integer> queue= new LinkedList<>();
        chkarr[S]=0;
        queue.add(S);
        while(!queue.isEmpty()){
            int temp= queue.poll();
            answer++;
            for(int x:MOVE){
                if((temp+x)==D){
                    answer=chkarr[temp]+1;
                    return answer;
                }
                if((temp+x)>=1 &&(temp+x)<=10000 && chkarr[temp+x]==0) {
                    queue.add(temp + x);
                    chkarr[temp + x] = chkarr[temp] + 1;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int S= sc.nextInt();
        int D= sc.nextInt();
        int chkarr[] = new int[10001];
        int answer= solution(S,D,chkarr);
        System.out.println(answer);
    }
}
