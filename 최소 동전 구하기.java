import java.util.*;

class Main {
    static int answer=0;
    static int dy[];
    public static void solution(int[] arr, int pay){
        Arrays.fill(dy,Integer.MAX_VALUE);
        dy[0] = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i];j<dy.length;j++){
                dy[j] = Math.min(dy[j],dy[j-arr[i]]+1);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int pay = sc.nextInt();
        dy=new int[pay+1];
        solution(arr,pay);
        System.out.println(dy[pay]);
    }

}
