import java.util.*;

class Main {
    static int min= Integer.MIN_VALUE,N;
    static class Schedule implements Comparable<Schedule>{
        int M,D;
        Schedule(int M, int D){
            this.M= M;
            this.D= D;
        }
        @Override
        public int compareTo(Schedule o){
            return o.D-this.D;
        }
    }

    static void solution(ArrayList<Schedule> arr){
        int answer=0;

        PriorityQueue<Integer> PQ= new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j=0;
        for(int i=min;i>=1;i--){
            for(;j<N;j++){
                if(arr.get(j).D<i){
                    break;
                }
                PQ.offer(arr.get(j).M);
            }
            if(!PQ.isEmpty()){answer+=PQ.poll();}
        }
        System.out.print(answer);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        N= sc.nextInt();
        ArrayList<Schedule> arr= new ArrayList<>();
        for(int i=0;i<N;i++){
            int m= sc.nextInt();
            int d=sc.nextInt();
            arr.add(new Schedule(m,d));
            if(d>min){
                min=d;
            }
        }
        solution(arr);

    }
}
