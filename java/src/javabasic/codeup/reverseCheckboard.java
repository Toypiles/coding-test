package javabasic.codeup;
import java.util.*;
public class reverseCheckboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[20][20];
        for(int i=1; i<=19; i++){
            for(int j=1; j<=19; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for(int j=1; j<=19; j++){
                if(arr[x][j]==0){
                    arr[x][j]=1;
                }else{
                    arr[x][j]=0;
                }
            }
            for(int j=1; j<=19; j++){
                if(arr[j][y]==0){
                    arr[j][y]=1;
                }else{
                    arr[j][y]=0;
                }
            }
        }
        for(int i=1; i<=19; i++){
            for(int j=1; j<=19; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
        scanner.close();
    }
}
