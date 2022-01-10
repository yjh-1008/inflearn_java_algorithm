import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;



class Main {
    static class Node {
        int data;
        Node lt, rt;
        Node(int data){
            this.data= data;
            lt=null;rt=null;
        }
    }
    public static void BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len= Q.size();
            for(int i=0;i<len;i++){
                Node current = Q.poll();
                System.out.print(current.data);
                if(current.lt!=null) {
                    Q.add(current.lt);
                }
                if(current.rt!=null) {
                    Q.add(current.rt);
                }
            }
            L++;
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Node root;
        root = new Node(1);
        root.lt=new Node(2);
        root.rt = new Node(3);
        root.lt.lt= new Node(4);
        root.lt.rt= new Node(5);
        root.rt.lt= new Node(6);
        root.rt.rt = new Node(7);
    }
}
