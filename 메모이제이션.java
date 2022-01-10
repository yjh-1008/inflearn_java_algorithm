import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;



class Main {
    static class Node{
        int data;
        Node lt,rt;
        Node(int data){
            this.data= data;
            lt=null;
            rt=null;
        }
    }
   // static int len=Integer.MIN_VALUE;
    static int bfsLen = Integer.MIN_VALUE;
    public static void BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        int L=0;
        while(!Q.isEmpty()){
            int len= Q.size();
            Node temp = Q.poll();
            for(int i=0;i<len;i++){
                if(temp.lt==null&&temp.rt==null){
                    bfsLen=L-1;
                    return;
                }else{
                    Q.add(temp.lt);
                    Q.add(temp.rt);
                }
            }
            L++;
        }
    }
    /*public static void DFS(int L,int N,Node root,int count){
        if(L+1==N){
            if(len<count){
                len=count;
            }
        }else{
            if(root.lt==null && root.rt==null){
                if(len<count){
                    len=count;
                }

            }else {
                DFS(L + 1, N, root.lt, count++);
                DFS(L + 1, N, root.rt, count++);
            }
        }
    }*/
    public static void main(String[] args){
        Node root;
        root = new Node(1);
        root.lt= new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt=new Node(5);
        //DFS(0,5,root,0);
        BFS(root);
        System.out.println(bfsLen);
    }
}
