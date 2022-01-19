import java.util.*;

class Main {
    static int arr[][];
    static int N, answer=0;
    static class Time implements Comparable<Time>{
        int s;
        int d;
        Time(int s, int d){
            this.s=s;
            this.d=d;
        }
        @Override
        public int compareTo(Time o){
            if(this.d==o.d){return this.s-o.s;}
            else return this.d-o.d;
        }
    }
    static void solution(ArrayList<Time> arr){
        Collections.sort(arr);
        int temp= Integer.MIN_VALUE;
        for(Time x: arr){
            if(temp<=x.s){
                temp=x.d;
                answer++;
            }
        }


    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        N= sc.nextInt();
        ArrayList<Time> arr= new ArrayList<>();
        for(int i=0;i<N;i++){
            arr.add(new Time(sc.nextInt(), sc.nextInt()));
        }
        solution(arr);
        System.out.print(answer);
    }
}
