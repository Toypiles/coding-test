package javabasic.baekjoon;
import java.util.Scanner;

public class intervalSum4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[] s=new long[n+1];
        for(int i=1; i<=n; i++){
            s[i]=s[i-1]+scanner.nextInt();
        }
        for(int q=0; q<m; q++){
            int i= scanner.nextInt();
            int j =scanner.nextInt();
            System.out.println(s[j]-s[i-1]);
        }
    }
}