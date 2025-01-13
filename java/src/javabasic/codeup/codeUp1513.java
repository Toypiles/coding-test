package javabasic.codeup;
import java.util.*;
public class codeUp1513 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] arr = new int[n][n];
        int count =0;
        for(int i=0; i<n; i++){
            count+=i;
        }
        // 출력의 최대값.
        int max = n*n-count;
        int i=n-1;
        int j=0;
        int many =0;
        int no=1;
        while (no<=max) {
            arr[i][j]=no;
            if(many%2==0){ // 정방향
                if(i==many){
                    i++;
                    many++;
                } else{
                    i--;
                    j++;
                }
            }
            else{
                if(i==n-1){
                    j++;
                    many++;
                } else{
                    i++;
                    j--;
                }
            }
            no++;
        }
        for(int[] p : arr){
            for(int q : p){
                System.out.print(q+" ");
            }System.out.println();
        }

        
    }
}
