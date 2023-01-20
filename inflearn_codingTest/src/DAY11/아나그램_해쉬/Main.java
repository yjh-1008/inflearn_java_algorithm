package DAY11.아나그램_해쉬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static String solution(HashMap hash1, HashMap hash2) {
        for(Object c:hash1.keySet()) {
            if(hash1.get(c) != hash2.get(c)) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> hash1 = new HashMap<>(), hash2 = new HashMap<>();
        String str = br.readLine();
        for(char c: str.toCharArray()) {
            hash1.put(c, hash1.getOrDefault(c, 0)+1);
        }

        str = br.readLine();
        for(char c: str.toCharArray()) {
            hash2.put(c, hash2.getOrDefault(c, 0)+1);
        }

        System.out.print(solution(hash1, hash2));
    }
}
