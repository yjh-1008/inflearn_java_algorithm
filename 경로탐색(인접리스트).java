import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;



class Main {
    static int answer=0;
    static int graph[][];
    static void DFS(ArrayList<Integer> arr[],boolean chk[],int s,int d){
        if(s==d){
            answer+=1;
            return;
        }else{
            for(int i=0;i<arr[s].toArray().length;i++){

                int temp=arr[s].get(i);
                if(!chk[temp]) {
                    chk[temp] = true;
                    DFS(arr, chk, temp, d);
                    chk[temp] = false;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        ArrayList<Integer> list[] =new ArrayList[N+1];
        for(int i=1;i<N;i++){
            list[i]= new ArrayList<Integer>();
        }
        int M= sc.nextInt();
        int n1,n2;
        for(int i=0;i<M;i++){
            n1= sc.nextInt();
            n2= sc.nextInt();
            list[n1].add(n2);
        }
        boolean chk[]= new boolean[N+1];
        chk[1]= true;
        int destination= sc.nextInt();
        DFS(list,chk,1,destination);
        System.out.print(answer);
    }
}
