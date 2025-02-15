package javabasic.baekjoon;
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class baek11720 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        char[] c = s.toCharArray();
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=(int) c[i]-'0';
        }
        System.out.println(sum);
    }
}


/*
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
 */