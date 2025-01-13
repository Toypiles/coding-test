package javabasic.codeup;

import java.util.Scanner;

public class sum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int num = scanner.nextInt();
            if(i>0){
                System.out.println(i+" "+(i-1)+" "+num);
                arr[i]= arr[i-1]+ num;
            } else{
                System.out.println(i+" "+num);
                arr[i]=num;
            }
        }

        for(int k : arr){
            System.out.print(k+" ");
        }System.out.println();

    }
}
