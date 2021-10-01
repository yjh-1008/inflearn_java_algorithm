import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static public void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine().toLowerCase().replaceAll("[^0-9]","");
        System.out.print(Integer.parseInt(s));
    }
}
