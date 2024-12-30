import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
public class nAndM9 {
    static int M, N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[] algin = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            algin[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(algin);
        int[] picked = new int[M];
        boolean[] isUsed = new boolean[10000];
        HashMap<String, Boolean> memo = new HashMap<>();
        func(0, algin, picked, isUsed, bw, memo);

        br.close();
        bw.flush();
        bw.close();
    }

    static void func(int k, int[] align, int[] picked, boolean[] isUsed, BufferedWriter bw, HashMap<String, Boolean> memo) throws IOException{
        if(k==M){
            StringBuilder sb = new StringBuilder();
            for(int i=0 ; i<k ; i++) {
                sb.append(align[picked[i]]);
                sb.append(',');
            }
            String alignString = sb.toString();
            for(int x=0; x<memo.size(); x++){
                if (memo.containsKey(alignString)) {
                    return;
                }
            }

            memo.put(alignString, true);

            for(int i=0; i<M; i++){
                bw.write(align[picked[i]]+ " ");
            } bw.newLine();
            return;
        }
        else {
            for(int i=0; i<N; i++){
                if(!isUsed[i]){
                    picked[k]=i;
                    isUsed[i]=true;
                    func(k+1, align, picked, isUsed, bw, memo);
                    isUsed[i]=false;
                }
            }
        }
    }
}

/*
 public class Main {

	static StringBuilder sb = new StringBuilder();
	static int n, m;
	static int [] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		arr = new int [n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		recur(new int[m], 0, new boolean [n]);
		
		System.out.println(sb);
		
		br.close();
		
	}

	private static void recur(int[] sel, int idx, boolean [] v) {
		if(idx == m) {
			for (int i = 0; i < sel.length; i++) {
				sb.append(sel[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		int before = 0;
		for (int i = 0; i < arr.length; i++) {
			if(!v[i] && before != arr[i]) {
				v[i] = true;
				before = arr[i];
				sel[idx] = arr[i];
				recur(sel, idx+1, v);
				v[i] = false;
				
			}
		}
		
	}

}
 */
