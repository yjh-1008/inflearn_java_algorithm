import java.io.*;
import java.util.*;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K= sc.nextInt();
        int arr[]= new int[N];
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        TreeSet<Integer> Tset= new TreeSet<>(Collections.reverseOrder());
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int l=j+1;l<N;l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int answer=-1;
        int cnt=0;
        for(int x:Tset){
            cnt++;
            if(cnt==K) {
                answer=x;
                break;
            }
        }
        System.out.print(answer);
    }
}