package javabasic.codeup;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=2; i<n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        
    }
}

/*
 * public static void main(String[] args) throws UnsupportedEncodingException{
        Scanner scanner = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        
    }
 */