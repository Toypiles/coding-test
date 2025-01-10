package javabasic.codeup;

import java.util.Scanner;

public class zigzagfill3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int k=1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i%2==0){
                    arr[j][i]=k;
                }else{
                    arr[n-1-j][i]=k;
                }
                k++;
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}
