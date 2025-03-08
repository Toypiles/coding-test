package javabasic.baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class baek1931 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] A =new int[n][2];
        for(int i=0; i<n; i++){
            A[i][0]=scanner.nextInt();
            A[i][1]=scanner.nextInt();
        }
        Arrays.sort(A, new Comparator<int []>() {
            @Override
            public int compare(int[] s, int[] e){
                if(s[1]==e[1]){
                    return s[0]-e[0];
                }
                return s[1]-e[1];
            }
        });
        int count=0;
        int end =-1;
        for(int i=0; i<n; i++){
            if(A[i][0]>=end){
                end=A[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
