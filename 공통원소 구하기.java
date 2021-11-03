import java.io.*;
import java.util.*;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        int n = sc.nextInt();
        int fArr[]= new int[n];
        for(int i=0;i<n;i++){
            fArr[i]=sc.nextInt();
        }
        Arrays.sort(fArr);
        int m=sc.nextInt();
        int lArr[] = new int[m];
        for(int i=0;i<m;i++){
            lArr[i]=sc.nextInt();
        }
        Arrays.sort(lArr);
        ArrayList<Integer> answer= new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            if(fArr[i]<lArr[j]){
                i++;
            }else if(fArr[i]>lArr[j]){
                j++;
            }else{
                answer.add(fArr[i]);
                i++;j++;
            }
        }
        for(int x:answer){
            System.out.print(x+" ");
        }
    }
}