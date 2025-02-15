package javabasic.baekjoon;
import java.util.Arrays;
import java.util.Scanner;

import java.io.*;
import java.util.StringTokenizer;
public class baek1253 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long[] s = new long[n];
        long count=0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            s[i]=Long.parseLong(st.nextToken());
        }
        Arrays.sort(s);
        for(int k=0; k<n; k++){
            long find = s[k];
            int i=0;
            int j=n-1;
            while (i<j) {
                if(s[i]+s[j]==find){
                    if(i!=k && j!=k){
                        count++;
                        break;
                    }
                    else if(i==k){
                        i++;
                    }
                    else if(j==k){
                        j--;
                    }
                } else if(s[i]+s[j]>find){
                    j--;
                } else{
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}

