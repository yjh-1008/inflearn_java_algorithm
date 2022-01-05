import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    static class Node{
        int data;
        Node lt,rt;
        Node(int data){
            this.data=data;
            lt=null;rt=null;
        }
    }
    public static void DFS(Node root){
        Node node= root;
        //System.out.println("11");
        if(node==null){return;}
        else{
            System.out.println(node.data);
            DFS(node.lt);
            DFS(node.rt);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Node root;
        /*
             1
          2     3
        4   5  6  7
        */
        root = new Node(1);
        root.lt = new Node(2);
        root.rt= new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt= new Node(5);
        root.rt.lt= new Node(6);
        root.rt.rt= new Node(7);
        DFS(root);
    }
}
