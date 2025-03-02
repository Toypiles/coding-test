package javabasic.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2023 {
    static int n;
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n= Integer.parseInt(st.nextToken());
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    static void DFS(int number, int jarisu){
        if(jarisu==n){
            if(isPrime(number)){
                System.out.println(number);
            }
        }

        for(int i=1; i<=9; i++){
            if(i%2==0){
                continue;
            }
            if(isPrime(number*10+i)){
                DFS(number*10+i, jarisu+1);
            }
        }
    }

    static boolean isPrime(int num){
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
