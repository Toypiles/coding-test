import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;

public class nAndM8 {
    static int M, N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[] align = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            align[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(align);
        int[] picked = new int[M];
        boolean[] isUsed = new boolean[N];
        func(0, align, picked, bw, isUsed);

        br.close();
        bw.flush();
        bw.close();
    }

    static void func(int k, int[] align, int[] picked, BufferedWriter bw, boolean[] isUsed) throws IOException{
        if(k==M){
            for(int i=0; i<M; i++){
                bw.write(align[picked[i]]+" ");
            }bw.newLine();
            return;
        } else {
            int small = k==0 ? 0 : picked[k-1];
            for(int i=small; i<N; i++){{
                    picked[k]=i;
                    func(k+1, align, picked, bw, isUsed);
            }
        }
    }
}
}