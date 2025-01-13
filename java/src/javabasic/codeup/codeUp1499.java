package javabasic.codeup;
import java.util.*;
public class codeUp1499 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int g = scanner.nextInt();
        int[] arr = new int[n];
        int mid = arr.length/g;

        for(int i=0; i<n; i++){
            int k = scanner.nextInt();
            arr[i]=k;

        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}