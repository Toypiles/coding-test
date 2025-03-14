package javabasic.baekjoon;

import java.util.Scanner;

public class baek2343 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m = scanner.nextInt();
        int[] A = new int[n];
        int start=0;
        int end=0;
        for(int i=0; i<n; i++){
            A[i]=scanner.nextInt();
            if(start<A[i]) start=A[i];
            end+=A[i];
        }
        while (start<=end) {
            int middle = (start+end)/2;
            int sum=0;
            int count=0;
            for(int i=0; i<n; i++){
                if(sum+A[i]>middle){
                    count++;
                    sum=0;
                }
                sum+=A[i];
            }
            if(sum!=0){
                count++;
            }
            if(count>m){
                start=middle+1;
            }
            else{
                end=middle-1;
            }
        }
        System.out.println(start);
    }
}
