package javabasic.codeup;
import java.util.Scanner;

public class codeUp1508 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0){
                    arr[i][j]= scanner.nextInt();
                }
                else if(i!=0){
                    arr[i][j]=arr[i][j-1]-arr[i-1][j-1];
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}
