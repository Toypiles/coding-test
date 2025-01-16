package javabasic.codeup;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[11][10];

        for(int i=0; i<11; i++){
            for(int j=0; j<10; j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        
        for(int i=0; i<10; i++){
            for(int j=9; j>=0; j--){
                if(arr[10][i]==1){
                    if(arr[j][i]>0){
                        System.out.println((i+1)+" crash");
                        break;
                    }
                    else if(arr[j][i]<0){
                        System.out.println((i+1)+" fall");
                        break;
                    }
                    else if(arr[j][i]==0){
                        if(j==0){
                            System.out.println((i+1)+" safe");
                        }
                    }
                }
            }
        }
    }
}
