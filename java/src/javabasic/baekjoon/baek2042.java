package javabasic.baekjoon;
import java.util.Scanner;

public class baek2042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int m = scanner.nextInt();
        int k= scanner.nextInt();
        int[] s = new int[n+1];
        long sum=0;
        for(int i=1; i<=n; i++){
            s[i]=s[i-1]+scanner.nextInt();
        }
        for(int i=0; i<k; i++){
            for(int j=0; j<m; j++){
                int a= scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                if(a==1){
                    s[b]=c;
                }
                else if (a==2){
                    sum=s[c]+s[b-1];
                    System.out.println(sum);
                }
            }
        }
    }
}
