package DAY11.학급회장;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static int N, maxVote=0;
    static String str;
    public static void solution() {
        HashMap<Character, Integer>  hash = new HashMap<>();
        Character answer = null;
        for(char c: str.toCharArray()) {
            hash.put(c, hash.getOrDefault(c, 0)+1);
            if(maxVote < hash.get(c)) {
                maxVote = hash.get(c);
                answer = c;
            }
        }
        
        System.out.print(answer);
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        str = br.readLine();
        solution();
    }
}
