package javabasic.codeup;
import java.util.Scanner;

public class zigzagfill6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        int k=1;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i%2==1){
                    arr[n-1-i][m-1-j]=k;
                }else{
                    arr[n-1-i][j]=k;
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
