package javabasic.codeup;
import java.util.Scanner;

public class sugarCookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h= scanner.nextInt();
        int w= scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[h+1][w+1];
        for(int t=1; t<=n; t++){
            int l = scanner.nextInt();
            int d = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(d==0){
                for(int k=0; k<l; k++){
                    arr[x][y+k]=1;
                }
            } else {
                for(int k=0; k<l; k++){
                    arr[x+k][y]=1;
                }
            }
        }
        for(int i=1; i<=h; i++){
            for(int j=1; j<=w; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}
