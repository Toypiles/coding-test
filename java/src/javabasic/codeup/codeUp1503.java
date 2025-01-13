package javabasic.codeup;
import java.util.Scanner;
public class codeUp1503 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k=1;
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i%2==0){
                    arr[i][j]=k++;
                }
                else{
                    arr[i][n-1-j]=k++;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}