import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
class Main {
    static class Point{
        int x,  y;
        Point(int x, int y){
            this.x = x;
            this. y=y;
        }
    }
    static int answer= Integer.MIN_VALUE;
    static int[] toX={-1,0,1,0};
    static int[] toY={0,1,0,-1};
    static int box[][],M,N,chk[][];
    static Queue<Point> Q = new LinkedList<>();

    static void BFS() {
        while (!Q.isEmpty()) {
            Point current = Q.poll();
            for (int j = 0; j < 4; j++) {
                int m1 = current.x + toX[j];
                int m2 = current.y + toY[j];
                if (m1 >= 0 && m1 < N && m2 >= 0 && m2 < M && box[m1][m2] == 0) {
                    box[m1][m2] = 1;
                    chk[m1][m2] = chk[current.x][current.y] + 1;
                    Q.offer(new Point(m1, m2));
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        M = sc.nextInt();
        N= sc.nextInt();
        box = new int[N][M];
        chk = new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                box[i][j] = sc.nextInt();
                if(box[i][j]==1){
                    Q.add(new Point(i,j));
                }
            }
        }
        BFS();
        boolean flag= true;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(box[i][j]==0){
                    flag=false;
                }
            }
        }
        if(flag){
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                        answer=Math.max(answer, chk[i][j]);
                }
            }
            System.out.println(answer);
        }else{
            System.out.print(-1);
        }
        BFS();
    }
}
