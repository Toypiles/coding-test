package javabasic.codeup;
import java.util.*;
public class codeUp1511 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] arr = new int[n][n];
        int sum=0;
        int k=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=k++;
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    sum+=arr[i][j];
                }
            }
        }

        System.out.println(sum);
    }
}
