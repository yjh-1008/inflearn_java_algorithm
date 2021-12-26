import java.util.*;

class Main {
    public static int solution(int n, int m, int arr[]){
        int answer=0;
        Arrays.sort(arr);
        int lt=0, rt=n-1;
        while(lt<=rt ){
            int mid= (lt+rt)/2;
            if(arr[mid]==m){
                answer=mid+1;
                break;
            }
            if(arr[mid]>m)rt=mid-1;
            else lt=mid+1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        int arr[] =new int[N];
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        int answer=solution(N,M,arr);
        System.out.println(answer);
    }
}
