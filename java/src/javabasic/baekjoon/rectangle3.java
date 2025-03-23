package javabasic.baekjoon;
import java.util.*;
public class rectangle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("*");
        }System.out.println();

        for(int i=1; i<n-1; i++){
            for(int j=0; j<n; j++){
                if(j==0 || j==n-1 || j==i || j==n-1-i){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){
            System.out.print("*");
        }System.out.println();
        scanner.close();
    }
}