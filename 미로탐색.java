import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
class Main {
    static int[] toX={-1,0,1,0};
    static int[] toY={0,1,0,-1};
    static int maze[][]= new int[8][8];
    static int len= 7;
    static int answer=0;
    public static void DFS(int s, int d){
        if(s==7 && d==7){
            answer++;
        }else {
            for(int i=0;i<4;i++){
                int m1=toX[i]+s;
                int m2=toY[i]+d;
                if(m1>=1 && m1<=7 && m2>=1 && m2<=7 && maze[m1][m2]==0){
                    maze[m1][m2]=1;
                    DFS(m1,m2);
                    maze[m1][m2]=0;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        for(int i=1;i<=len;i++){
            for(int j=1;j<=len;j++){
                maze[i][j] = sc.nextInt();
            }
        }
        for(int i=1;i<=len;i++){
            for(int j=1;j<=len;j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
        maze[1][1]=1;
        DFS(1,1);
        System.out.print(answer);
    }
}
