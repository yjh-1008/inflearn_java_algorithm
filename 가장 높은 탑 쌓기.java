import java.util.*;

class Main {
    static class Block implements Comparable<Block>{
        int width;
        int height;
        int weight;
        Block(int width, int height, int weight){
            this.width=width;
            this.height=height;
            this.weight = weight;
        }
        //밑면의 넓이를 기준으로 내림차순으로 정렬
        @Override
        public int compareTo(Block b){
            return b.width-this.width;
        }
    }
    static int answer=0;
    static int chk[];
    public static void solution(ArrayList<Block> arr, int idx){

        int currentWeight = arr.get(idx).weight;
        int max_height = 0;

        for(int i=idx;i>=0;i--){
            if(currentWeight< arr.get(i).weight){
                //idx의 height와 i의 height를 더한다.
                // 그 뒤 이전에 더했었던 값과 비교하여 큰 값을 넣는다.
                if(chk[i] > max_height){
                    max_height=chk[i];
                }
            }
        }
        chk[idx] = arr.get(idx).height+max_height;
        if(answer< chk[idx]){
            answer=chk[idx];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Block> arr =  new ArrayList<>();
        int n = sc.nextInt();
        chk =  new int[n];
        for(int i=0;i<n;i++){
            Block block = new Block(sc.nextInt(), sc.nextInt(), sc.nextInt());
            arr.add(block);
        }
        Collections.sort(arr);
        chk[0] = arr.get(0).height;
        for(int i=1;i<arr.size();i++){
            solution(arr,i);
        }
        System.out.println(answer);
    }

}
