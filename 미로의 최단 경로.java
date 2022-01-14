import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
class Main {
    static class Node {
        int x;
        int y;
        Node(int x, int y){
            this.x= x;
            this.y=y;
        }
    }
    static int answer= Integer.MAX_VALUE;
    static int[] toX={-1,0,1,0};
    static int[] toY={0,1,0,-1};
    static int maze[][]= new int[8][8];
    static int BFS(int s, int d){
        Queue<Node> Q= new LinkedList<>();
        Q.offer(new Node(s,d));
        int count=0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int j=0;j<len;j++) {
                Node current = Q.poll();
                if(current.x==7 && current.y==7){
                    if(answer>count){
                        answer=count;
                        return answer;
                    }
                }else {
                    for (int i = 0; i < 4; i++) {
                        int m1 = current.x + toX[i];
                        int m2 = current.y + toY[i];
                        if (m1 >= 1 && m1 <= 7 && m2 >= 1 && m2 <= 7 && maze[m1][m2] == 0) {
                            maze[m1][m2]=1;
                            Q.offer(new Node(m1, m2));
                        }
                    }
                }
            }
            count++;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                maze[i][j] = sc.nextInt();
            }
        }
        maze[1][1]=1;
        System.out.print(BFS(1,1));
    }
}
