import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class nAndM12 {
    static int N, M;
    static int[] arr, picked;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        arr = new int[N];
        picked = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
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
            }sb.append("\n");
            return;
        }
        int past=0;
        int smallest = k==0 ? 0 : picked[k-1];
        for(int i=smallest; i<N; i++){
            if(arr[i]!=past){
                past=arr[i];
                picked[k]=i;
                func(k+1);
            }
        }
    }
}
