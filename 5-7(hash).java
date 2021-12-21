import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static boolean comparasion(int x, int y){
        if(x<y){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        Scanner sc= new Scanner(System.in);
        char[] preSubject= sc.nextLine().toCharArray();
        char[] subject= sc.nextLine().toCharArray();
        String answer="YES";
        for(int i=0;i<preSubject.length;i++){
            boolean chk=false;
            for(int j=0;j<subject.length;j++){
                if(subject[j]==preSubject[i]){
                    chk=true;
                }
            }
            if(!chk){
                System.out.println("NO");
                return;
            }
            hash.getOrDefault(preSubject[i],hash.put(preSubject[i],i));
        }
        for(int i=0;i<subject.length-1;i++){
            if(hash.get(subject[i])!=null && hash.get(subject[i+1])!=null){
                if(!comparasion(hash.get(subject[i]), hash.get(subject[i + 1]))){
                    answer="NO";
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
