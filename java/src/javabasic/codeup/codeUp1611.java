package javabasic.codeup;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class codeUp1611 {
    public static void main(String[] args) throws UnsupportedEncodingException{
        Scanner scanner = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a%2==0 && b%2==0){
            out.println("짝수+짝수=짝수");
        } else if(a%2==1 && b%2==0){
            out.println("홀수+짝수=홀수");
        } else if(a%2==0 && b%2==1){
            out.println("짝수+홀수=홀수");
        } else{
            out.println("홀수+홀수=짝수");
        }
    }
}