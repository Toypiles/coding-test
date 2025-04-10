package javabasic.baekjoon;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class nAndM10{
    static int N, M;
    static int[] arr, picked;
    static boolean[] isUsed;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        picked = new int[M];
        arr = new int[N];
        isUsed = new boolean[N];
        st= new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        func(0);
        System.out.println(sb);
        br.close();
    }

    static void func(int k){
        if(k==M){
            for(int r : picked){
                sb.append(arr[r]).append(" ");
            }
            sb.append("\n");
            return;
        }
        int before =-1;
        int smallest = k==0 ? 0 : picked[k-1]+1;
        for(int i=smallest; i<N; i++){
            if(!isUsed[i] && arr[i]!=before){
                isUsed[i]=true;
                before=arr[i];
                picked[k]=i;
                func(k+1);
                isUsed[i]=false;
            }
        }
    }
}