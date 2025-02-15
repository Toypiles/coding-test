package javabasic.baekjoon;
import java.util.*;

public class baek10986 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m = scanner.nextInt();
        long[] s = new long[n];
        long[] c =new long[m];
        long count=0;
        s[0]=scanner.nextLong();
        for(int i=1; i<n; i++){
            s[i]=s[i-1]+scanner.nextLong();
        }
        for(int i=0; i<n; i++){
            int r = (int)(s[i]%m);
            if(r==0){
                count++;
            }
            c[r]++;
        }

        for(int i=0; i<m; i++){
            if(c[i]>1){
                count+=(c[i]*(c[i]-1)/2);
            }
        }
        System.out.println(count);
    }
}

