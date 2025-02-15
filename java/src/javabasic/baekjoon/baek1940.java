package javabasic.baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class baek1940 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr= new int[n];
        long count=0;
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        while (i<j) {
            if(arr[i]+arr[j]>m){
                j--;
            }
            else if(arr[i]+arr[j]==m){
                count++;
                i++;
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(count);
    }
}
