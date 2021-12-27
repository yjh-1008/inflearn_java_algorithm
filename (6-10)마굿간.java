import java.util.*;

class Main {
    public static int solution(int N,int M, int[] arr){
        int answer=0;
        Arrays.sort(arr);
        int lt=1;
        int rt=arr[N-1];
        while(lt<=rt){
            int mid=(lt+rt)/2;
            boolean chk =false;
            int count=1;
            int ep=0;
            for(int i=0;i<N;i++){
                if(arr[i]-arr[ep]>=mid){
                    ep=i;
                    count++;
                    if(count==M)break;
                }
            }
            if(count<M){
                rt=mid-1;
            }else{
                answer=mid;
                lt=mid+1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        int answer=solution(N,M,arr);
        System.out.println(answer);
        //12489
    }
}
