package javabasic.codeup;

import java.util.Scanner;

public class snail1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        int k=1;
        int sum=n+m;
        for(int t=0; t<sum; t++){
            for(int i=0; i<n-t; i++){
                for(int j=0+t; j<m-t; j++){
                    if(i==0+t){
                        //System.out.println(i+" "+j+" "+k);
                        arr[i][j]=k++;
                    }
                }
            }
            for(int j=0; j<m; j++){
                for(int i=1+t; i<n-t; i++){
                    if(j==m-1-t){
                        //System.out.println(i+" "+j+" "+k);
                        arr[i][j]=k++;
                    }
                }
            }
            if(n%2==0){
                for(int i=1; i<n-t; i++){
                    for(int j=1+t; j<m-t; j++){
                        if(i==n-1-t){
                            //System.out.println(i+" "+(m-1-j)+" "+k);
                            arr[i][m-1-j]=k++;
                        }
                    }
                }
            } else{
                for(int i=2; i<n-t; i++){
                    for(int j=1+t; j<m-t; j++){
                        if(i==n-1-t){
                            //System.out.println(i+" "+(m-1-j)+" "+k);
                            arr[i][m-1-j]=k++;
                        }
                    }
                }
            }
            
            for(int j=0; j<m-t; j++){
                for(int i=1+t; i<n-1-t; i++){
                    if(j==0+t){
                        //System.out.println(n-1-i+" "+j+" "+k);
                        arr[n-1-i][j]=k++;
                    }
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
 * for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==0){
                    arr[i][j]=k++;
                }
            }
        }
        // j==m-1
        for(int j=0; j<m; j++){
            for(int i=1; i<n; i++){
                if(j==m-1){
                    arr[i][j]=k++;
                }
            }
        }
        // i==n-1, reverse
        for(int i=0; i<n; i++){
            for(int j=1; j<m; j++){
                if(i==n-1){
                    arr[i][m-1-j]=k++;
                }
            }
        }
        // j==0, reverse
        for(int j=0; j<m; j++){
            for(int i=1; i<n-1; i++){
                if(j==0){
                    arr[n-1-i][j]=k++;
                }
            }
        }
 * //System.out.println(i+" "+j+" "+k);
        for(int i=0; i<n; i++){
            for(int j=1; j<m-1; j++){
                if(i==1){
                    arr[i][j]=k++;
                }
            }
        }
        for(int j=0; j<m; j++){
            for(int i=2; i<n-1; i++){
                if(j==m-2){
                    arr[i][j]=k++;
                }
            }
        }
        //
        for(int i=0; i<n; i++){
            for(int j=2; j<m-1; j++){
                if(i==n-2){
                    arr[i][m-1-j]=k++;
                }
            }
        }
 */