import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static boolean chk(int res){
        if(res==1){
            return false;
        }
        for(int i=2;i<res/2+1;i++){
            if(res%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int nums[]=new int[N];
        StringBuilder sb= new StringBuilder();
       for(int i=0;i<N;i++){
           nums[i]=sc.nextInt();
       }
       ArrayList <Integer> answer= new ArrayList<>();
       for(int i=0;i<N;i++){
           int tmp=nums[i];
           int res=0;
           int t;
           while(tmp>0){
               t=tmp%10;
               res=res*10+t;
               tmp/=10;
           }
           if(chk(res)){
               sb.append(res+" ");
           }
       }
        System.out.print(sb.toString());
    }
}

