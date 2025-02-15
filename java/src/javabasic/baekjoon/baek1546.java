package javabasic.baekjoon;

import java.util.Scanner;

public class baek1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        long sum=0;
        long max=0;
        for(int i=0; i<n; i++){
            if(max<arr[i]){
                max=arr[i];
            }
            sum+=arr[i];
        }
        System.out.println((double)(sum*100/max)/n);
    }
}
