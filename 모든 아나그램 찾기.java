import java.io.*;
import java.util.*;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char S[]=  sc.nextLine().toLowerCase().toCharArray();
        char[] T= sc.nextLine().toLowerCase().toCharArray();
        HashMap<Character, Integer> hash= new HashMap<>();
        HashMap<Character, Integer> hash1= new HashMap<>();
        int count=0;
        int lt=0,rt=T.length;
        for(int i=0;i<rt;i++){
            hash1.put(T[i],hash1.getOrDefault(T[i],0)+1);
            hash.put(S[i],hash.getOrDefault(S[i],0)+1);
        }
        if(hash.equals(hash1)){
            count++;
        }
        while(rt<S.length){
            hash.put(S[rt],hash.getOrDefault(S[rt],0)+1);
            hash.put(S[lt],hash.get(S[lt])-1);
            if(hash.get(S[lt])==0){
                hash.remove(S[lt]);
            }
            rt++;
            lt++;
            if(hash1.equals(hash)){
                count++;
            }
        }
        System.out.print(count);
    }
}