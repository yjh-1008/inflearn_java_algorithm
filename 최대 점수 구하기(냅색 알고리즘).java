import java.util.*;

class Main {
    static int dy[];
    static class Test implements Comparable<Test>{
        int time;
        int score;
        Test(int score, int time){
            this.time = time;
            this.score = score;
        }
        @Override
        public int compareTo(Test T){
            return T.score-this.score;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int M = sc.nextInt();
        dy = new int[M+1];
        ArrayList<Test> test = new ArrayList<>();
        for(int i=0;i<N;i++){
            Test t = new Test(sc.nextInt(),sc.nextInt());
            test.add(t);
        }
        for(int i=0;i<N;i++){
            for(int j=M;j>=test.get(i).time;j--){
                if(j-test.get(i).time>=0){ //시간 초과가 아니라면
                    dy[j] = Math.max(dy[j], dy[j-test.get(i).time]+test.get(i).score);
                    //System.out.println()
                }
            }
        }
        System.out.println(dy[M]);



    }

}
