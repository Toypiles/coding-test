package javabasic.codeup;
import java.util.*;
public class codeUp1493 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m= scanner.nextInt();
        int[][] arr = new int[n][m];
        int[][] result = new int[n][m];
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scanner.nextInt();
                for(int x=0; x<=i; x++){
                    for(int y=0; y<=j; y++){
                        count+=arr[x][y];
                    }
                }
                result[i][j]=count;
                count=0;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(result[i][j]+" ");
            }System.out.println();
        }
    }
}
