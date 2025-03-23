package javabasic.baekjoon;
import java.util.*;
public class hatchedSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k= scanner.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                } else if(k==1){
                    System.out.print("*");
                } else if((i+j)%k==1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        scanner.close();
    }

}