import java.io.*;
import java.util.*;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Character,Integer> hash= new HashMap<Character, Integer>();
        String s= sc.next();
        for(char x:s.toCharArray()){
            hash.put(x,hash.getOrDefault(x,0)+1);
        }
        char answer = 0;
        int max=0;
        for(Map.Entry<Character,Integer> x : hash.entrySet()){
            int strValue= x.getValue();
            if(max<strValue){
                max=strValue;
                answer=x.getKey();
            }
        }
        System.out.println(answer);
    }
}