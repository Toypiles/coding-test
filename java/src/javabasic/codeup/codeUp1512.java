package javabasic.codeup;
import java.util.Scanner;

public class codeUp1512 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n+1][n+1];
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        for(int k=1; k<=X+1; k++){
            for(int l=1; l<=Y+1; l++){
                arr[X][Y]=1;
                if(k==1 && l==1){
                    arr[k][l]=6;
                }
                else{
                    for(int i=1; i<n; i++){
                        if(k+l==l+k){
                            arr[k][l]=6-i;
                        }
                    }
                }
                
                
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
        
    }
}

