package javabasic.baekjoon;
import java.util.*;
public class parallelogram1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n; i++){
            for(int j=n-1; j>i; j--){
                System.out.print(" ");
            }
            for(int j=0; j<n; j++){
                System.out.print("*");
            }System.out.println();
        }
        scanner.close();
    }
}
