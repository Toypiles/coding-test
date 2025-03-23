package javabasic.baekjoon;
import java.util.*;
public class sumSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                sum+=j;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
