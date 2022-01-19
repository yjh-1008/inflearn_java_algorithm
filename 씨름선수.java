import java.util.*;

class Main {
    static int arr[][];
    static int max=Integer.MIN_VALUE, answer=0;
    static class Player{
        int h,w;
        Player(int h, int w){
            this.h= h;
            this.w=w;
        }
    }
    public static void solution(){
        for(int i=0;i<arr.length;i++){
            if(arr[i][1]>max){
                answer++;
                max= arr[i][1];
            }
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        arr = new int[N][N];
        for(int i=0;i<N;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0]-o1[0];
            }
        });
        solution();
        System.out.println(answer);
    }
}
