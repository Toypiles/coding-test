package javabasic.codeup;
import java.util.Scanner;

public class sugarCookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h= scanner.nextInt();
        int w= scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[11][11];
        for(int t=1; t<=n; t++){
            int l = scanner.nextInt();
            int d = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            arr[x][y]=1;
            for(int i=1; i<=h; i++){
                for(int j=1; j<=w; j++){
                    for(int k=0; k<l; k++){
                        if(d==0){
                            arr[i][j+k]=1;
                        }
                        else if(d==1){
                            arr[i+k][j]=1;
                        }
                    }
                }
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(arr[i][j]==1){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print(arr[i][j]+" ");
                }
            }System.out.println();
        }
    }
}
