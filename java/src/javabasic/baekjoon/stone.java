package javabasic.baekjoon;
import java.util.*;
public class stone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        for(int i=0; i<=N ; i++) {
            cache[i] = -1;
        }
        if(isWin(N)){
            System.out.println("SK");
        } else{
            System.out.println("CY");
        }
        scanner.close();
    }
    //기저조건 가장 기본적인 조건
    static int[] cache = new int[1001];
    static boolean isWin(int N){
        if(N==1 || N==3){
            return true;
        }
        if(N==2 || N==4){
            return false;
        }
        if (cache[N] != -1) {
            if (cache[N] == 1) return true;
            else return false;
        }
        if(isWin(N-1)==false || isWin(N-3)==false){
            cache[N] = 1;
            return true;
        }
        cache[N] = 0;
        return false;
        
    }
}
