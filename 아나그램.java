import java.io.*;
import java.util.*;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char str1[]= sc.nextLine().toLowerCase().toCharArray();
        char str2[]= sc.nextLine().toLowerCase().toCharArray();
        HashMap<Character, Integer> hash1= new HashMap<>();
        HashMap<Character, Integer> hash2= new HashMap<>();
        for(int i=0;i< str1.length;i++){
            hash1.put(str1[i], hash1.getOrDefault(str1[i],0)+1);
            hash2.put(str2[i], hash2.getOrDefault(str2[i],0)+1);
        }
        boolean chk=false;
        for(Map.Entry<Character, Integer> x :hash1.entrySet()){
            char key= x.getKey();
            int value= x.getValue();
            if(hash2.get(key)!=null && value==hash2.get(key)){
                chk=true;
            }else{
                chk=false;
                break;
            }
        }
        if(!chk){
            System.out.print("NO");
        }else{
            System.out.print("YES");
        }
        sc.close();

    }
}