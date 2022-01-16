import java.util.*;

class Main {
    static int [][] arr;
    static int[] chk;
    static int answer=Integer.MAX_VALUE,n,m,len;
    static ArrayList<Node> H,P;
    static class Node{
        int x, y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static void DFS(int L,int s){
        if(L==m){
            int sum=0;
            for(int i=0;i<H.size();i++){
                int HX= H.get(i).x;
                int HY= H.get(i).y;
                int dis= Integer.MAX_VALUE;
                for(int j:chk){
                    int PX= P.get(j).x;
                    int PY= P.get(j).y;
                    dis =Math.min(dis, Math.abs(HX-PX)+Math.abs(HY-PY));
                }
                sum+=dis;
            }
            answer= Math.min(answer,sum);
        }
        else{
            for(int i=s;i<len;i++){
                chk[L]=i;
                DFS(L+1,i+1);
            }

        }
    }
    //각 최소거리를 구한다.
    //
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        m= sc.nextInt();
        chk= new int[m];
        H= new ArrayList<>();
        P= new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int tmp=sc.nextInt();
                if(tmp==1){H.add(new Node(i,j));}
                else if(tmp==2) {P.add(new Node(i,j));}
            }
        }
        len= P.size();
        DFS(0,0);
        System.out.print(answer);

    }
}
