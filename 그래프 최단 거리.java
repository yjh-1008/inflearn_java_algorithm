import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
class Main {
    static int answer[];
    static void BFS(ArrayList list[], int s, int d,int n){
        Queue<Integer> Q = new LinkedList<>();
        Q.add(s);
        int chk[] = new int[n+1];
        chk[s]=1;
        int count=0;
        while(!Q.isEmpty()){
            int len= Q.size();
            for(int j=0;j<len;j++) {
                int current = Q.poll();
                if (current==d && answer[d]>count) {
                    answer[d]=count;
                }
                for (Object x:list[current]) {
                        if (chk[(Integer)x] != 1) {
                            chk[(Integer)x]=1;
                            Q.offer((Integer)x);
                        }
                }
                if(j+1==len){
                    count++;
                }
            }
            //31122

        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        answer= new int[N+1];
        ArrayList<Integer> list[] =new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            list[i]= new ArrayList<Integer>();
            answer[i]=Integer.MAX_VALUE;
        }
        int M= sc.nextInt();
        int n1,n2;
        for(int i=0;i<M;i++){
            n1=sc.nextInt();
            n2=sc.nextInt();
            list[n1].add(n2);
        }
        for(int i=2;i<=N;i++){
            BFS(list,1,i,N);
        }
        for(int i=2;i<=N;i++){
            System.out.print(answer[i]+" ");
        }
    }
}
