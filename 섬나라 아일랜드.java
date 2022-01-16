import java.util.*;

class Main {
    static int [][] arr,chk;
    static int[] toX={-1,0,1,1,1,0,-1,-1}, toY={1,1,1,0,-1,-1,-1,0};
    static int answer=0,n;
    static class Node{
        int x, y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static void BFS(int x, int y) {
        Queue<Node> Q=new LinkedList<>();
        Q.add(new Node(x, y));
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0;i<len;i++){
                Node current= Q.poll();
                for(int j=0;j< toX.length;j++){
                    int m1= current.x+toX[j];
                    int m2= current.y+toY[j];
                    if(m1>=0 && m1<n && m2>=0 && m2<n && arr[m1][m2]==1){
                        arr[m1][m2]=0;
                        Q.add(new Node(m1,m2));
                    }
                }
            }
        }
        answer++;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        arr= new int[n][n];
        chk= new int[n][n];
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                arr[i][j]= sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                if(arr[i][j]==1){
                    BFS(i,j);
                }
            }
        }
        System.out.print(answer);
    }
}
