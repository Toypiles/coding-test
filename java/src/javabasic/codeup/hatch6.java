package javabasic.codeup;

import java.util.Scanner;

public class hatch6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        int k=1;
        int sum=n+m;
        for(int t=0; t<sum; t++){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(i+j==t){
                        arr[n-1-i][m-1-j]=k;
                        k++;
                    }
                }
            }
        }
            

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}
