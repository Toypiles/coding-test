package javabasic.baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class nAndM3 {
    static int N, M;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[M];
        func(0, arr, bw);

        br.close();
        bw.flush();
        bw.close();
    }

    static void func(int k, int[] arr, BufferedWriter bw) throws IOException{
        if(k==M){
            for(int i=0; i<M; i++){
                bw.write(arr[i]+ " ");
            }
            bw.newLine();
            return;
        }
        else {
            for(int i=1; i<=N; i++){
                arr[k]= i;
                func(k+1, arr, bw);
            }
        }
    }
}
