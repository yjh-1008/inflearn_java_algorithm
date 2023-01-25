package DAY12.모든아나그램찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static boolean chk(HashMap<Character,Integer> hash, HashMap<Character,Integer> anaHash) {
        for(char c: anaHash.keySet()) {
            if(!anaHash.get(c).equals(hash.get(c))) return false;
        }
        return true;
    }


    public static int solution(char[] str, char[] ana) {
        int answer = 0;
        HashMap<Character, Integer> hash = new HashMap<>();
        HashMap<Character, Integer> anaHash = new HashMap<>();
        for(int i=0; i<ana.length; i++) {
            hash.put(str[i],hash.getOrDefault(str[i],0)+1);
            anaHash.put(ana[i],anaHash.getOrDefault(ana[i],0)+1);
        }
        if(chk(hash,anaHash)) answer++;
        int lt =0;
        for(int rt=ana.length; rt<str.length; rt++) {
            hash.put(str[rt],hash.getOrDefault(str[rt],0)+1);
            if(hash.get(str[lt])==1) hash.remove(str[lt]);
            else hash.put(str[lt], hash.get(str[lt])-1);
            lt++;
            if(chk(hash, anaHash)) answer++;
        }

        return answer;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char str[] = br.readLine().toCharArray();
        String ana = br.readLine();

        System.out.print(solution(str, ana.toCharArray()));
    }
}
