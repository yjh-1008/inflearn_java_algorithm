import java.util.*;

class Main {
    static int arr[][];
    static int N;
    static long answer=0;
    static class Time implements Comparable<Time>{
        int t;
        char c;
        Time(int t, char c){
            this.t =t;
            this.c =c;
        }
        @Override
        public int compareTo(Time o){
            if(o.t==this.t){return this.c-o.c;}
            else{return this.t-o.t;}
        }
    }
    static void solution(ArrayList<Time> arr) {
        Collections.sort(arr);
        int cnt=0;
        for(Time x: arr){
            if(x.c=='s'){
                cnt++;
            }else if(x.c=='e'){
                cnt--;
            }
            answer= Math.max(answer, cnt);
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        N= sc.nextInt();
        ArrayList<Time> arr= new ArrayList<>();
        for(int i=0;i<N;i++){
            arr.add(new Time(sc.nextInt(), 's'));
            arr.add(new Time(sc.nextInt(), 'e'));
        }
        solution(arr);
        System.out.print(answer);
    }
}
