package javabasic.baekjoon;

import java.util.Scanner;

public class baek1456 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long min = scanner.nextLong();
        long max= scanner.nextLong();
        long [] A = new long[10000001];
        for(int i=2; i<A.length; i++){
            A[i]=i;
        }
        for(int i=2; i<=Math.sqrt(A.length); i++){
            if(A[i]==0){
                continue;
            }
            for(int j=i*i; j<A.length; j+=i){
                A[j]=0;
            }
        }
        int count=0;
        for(int i=2; i<10000001; i++){
            if(A[i]!=0){
                long temp =A[i];
                while ((double)A[i]<=(double)max/(double)temp) {
                    if((double)A[i]>=(double)min/(double)temp){
                        count++;
                    }
                    temp*=A[i];
                }
            }
        }
        System.out.println(count);
    }
}
