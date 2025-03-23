package javabasic.baekjoon;
import java.util.*;
public class matrixAdd {
    static int[][] sum;
    static int result;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        int M= scanner.nextInt();
        int[][] arr = new int[N][M];
        sum= new int[N][M];
        for(int k=0; k<2; k++){
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    arr[i][j]=scanner.nextInt();
                    sum[i][j]+=arr[i][j];
                }
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                result=sum[i][j];
                System.out.print(result+" ");
            }
            System.out.println();
        }
        scanner.close();
        
    }
}
