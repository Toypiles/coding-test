package javabasic.codeup;
import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int num = scanner.nextInt();
                if(i>0){
                    
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
/*
 * if(i==0 && j==0){
                    //System.out.println(i+" "+j+" "+num);
                    arr[i][j]=num;
                }
                else if(i>0 && j==0){
                    //System.out.println("\n"+i+""+j+" "+(i-1)+""+j+" "+num);
                    arr[i][j] = arr[i-1][j] +num;
                }
                else if(j>0 && i==0){
                    arr[i][j] = arr[i][j-1] +num;
                }
                else {
                    arr[i][j] =arr[i-1][j]+ arr[i][j-1]+num;
                }
 */