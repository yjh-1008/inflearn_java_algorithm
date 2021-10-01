import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static public void main(String[] args) throws IOException {
        String answer="";
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        int arr[]= new int[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MAX_VALUE;
        }
        String ch=sc.next();
        int leftCount=-1;
        int rightCount;
        for(rightCount=0;rightCount<s.length();rightCount++){
            if(s.charAt(rightCount)==ch.charAt(0)){
                arr[rightCount]=0;
                    for(int j=rightCount;j>=0;j--){
                        if(arr[j]==s.charAt(0)) {
                            break;
                        }
                        if(arr[j]>rightCount-j) {
                            arr[j] = rightCount - j;
                        }
                    }
                    for(int j=rightCount;j<arr.length;j++) {
                        if (arr[j] == s.charAt(0)) {
                            break;
                        }
                        if(arr[j]>rightCount-j) {
                            arr[j] = j-rightCount;
                        }
                    }
                    leftCount=rightCount;
                }
            }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
