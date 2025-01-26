package javabasic.codeup;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException{
        Scanner scanner = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        int a = scanner.nextInt();
        if(a>=90){
            out.println("A");
        } else if(a>=80){
            out.println("B");
        } else if(a>=70){
            out.println("C");
        } else if(a>=60){
            out.println("D");
        }
        else{
            out.println("F");
        }
    }
}


/*
 * public static void main(String[] args) throws UnsupportedEncodingException{
        Scanner scanner = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        
    }
 */