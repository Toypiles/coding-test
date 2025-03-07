package javabasic.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baek1920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++){
            A[i]=scanner.nextInt();
        }
        Arrays.sort(A);
        int m= scanner.nextInt();
        for(int i=0; i<m; i++){
            boolean find = false;
            int target = scanner.nextInt();
            int start=0;
            int end=A.length-1;
            while (start<=end) {
                int midi =(start+end)/2;
                int midV = A[midi];
                if(midV > target){
                    end=midi-1;
                } else if(midV<target){
                    start=midi+1;
                } else{
                    find=true;
                    break;
                }
            }
            if(find){
                System.out.println(1);
            } else{
                System.out.println(0);
            }
        }
    }
}