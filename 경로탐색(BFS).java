import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;



class Main {
    static int answer=0;
    static int graph[][];
    static void DFS(int s,int d,int m,boolean chk[]){

        for(int i=1;i<=d;i++){
            if(i==d){
                if(graph[s][i]==1) {
                    answer+=1;
                    return;
                }
            }else{
                if(graph[s][i]==1 && !chk[i]){
                    chk[s]=true;
                    DFS(i,d,m,chk);
                    chk[s]=false;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        graph = new int[N+1][N+1];
        int M = sc.nextInt();
        for(int i=0;i<M;i++){
            int n1= sc.nextInt();
            int n2= sc.nextInt();
            graph[n1][n2]=1;
        }
        boolean chk[]= new boolean[N+1];
        chk[1]=true;
        int destination= sc.nextInt();
        DFS(1,destination,M,chk);
        System.out.print(answer);
    }
}
