package javabasic.baekjoon;

import java.util.Scanner;

public class baek1747 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[10000001];
        for(int i=2; i<A.length; i++){
            A[i]=i;
        }
        for(int i=2; i<Math.sqrt(A.length); i++){
            if(A[i]==0){
                continue;
            }
            for(int j=i*i; j<A.length; j+=i){
                A[j]=0;
            }
        }
        int i=n;
        while (true) {
            if(A[i]!=0){
                int result=A[i];
                if(isPalindrome(result)){
                    System.out.println(result);
                    break;
                }
            }
            i++;
        }
    }

    private static boolean isPalindrome(int target){
        char[] temp = String.valueOf(target).toCharArray();
        int s=0;
        int e=temp.length-1;
        while (s<e) {
            if(temp[s]!=temp[e]){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
