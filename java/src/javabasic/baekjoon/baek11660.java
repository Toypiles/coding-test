package javabasic.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[][] s = new long[n+1][n+1];
        long[][] D = new long[n+1][n+1];
        long sum=0;
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++){
                s[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                D[i][j]=D[i-1][j]+D[i][j-1]-D[i-1][j-1]+s[i][j];
            }
        }
        for(int q=0; q<m; q++){
            st= new StringTokenizer(br.readLine());
            int x1= Integer.parseInt(st.nextToken());
            int y1= Integer.parseInt(st.nextToken());
            int x2= Integer.parseInt(st.nextToken());
            int y2= Integer.parseInt(st.nextToken());
            sum=D[x2][y2]-D[x1-1][y2]-D[x2][y1-1]+D[x1-1][y1-1];
            System.out.println(sum);
        }
    }
}
