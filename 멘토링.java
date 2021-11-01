import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int arr[][]= new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int answer=0;
        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                if(i!=j){
                    int temp1=arr[0][i];
                    int temp2=arr[0][j];
                    boolean chk=false;
                    for(int k=0;k<N;k++){
                        int chk1=-1;
                        int chk2=-1;
                        for(int s=0;s<M;s++){
                            if(temp1==arr[k][s]){
                                chk1=s;
                            }
                            if(temp2==arr[k][s]){
                                chk2=s;
                            }
                        }
                        if(chk1<chk2){
                            chk=true;
                        }
                    }
                    if(!chk){
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}

