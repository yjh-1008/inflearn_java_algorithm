import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int arr[] = new int [N];
        String answer="U";
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        int t1=0, t2=0;
        int sortArr[] = Arrays.copyOf(arr,arr.length);
        Arrays.sort(sortArr);
        for(int i=0;i<N;i++){
            //System.out.println(arr[i]+" "+sortArr[i]);
            if(arr[i]!=sortArr[i]){
                if(t1!=0){
                    t2=i+1;
                }else{
                    t1=i+1;
                }
            }
        }
        if(t1<t2) {
            System.out.print(t1 + " " + t2);
        }else{
            System.out.print(t2 + " " + t1);
        }
    }
}

// 120 125 128 127 130 135 135 143 160