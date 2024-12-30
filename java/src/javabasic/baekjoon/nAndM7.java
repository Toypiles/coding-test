import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
public class nAndM7 {
    static int N, M;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[] align = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            align[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(align);
        int[] picked = new int[M];
        func(0, align, picked, bw);

        br.close();
        bw.flush();
        bw.close();
    }
    //k가 몇번째 숫자인지, align 2째줄 입력 숫자, picked가 선택한 숫자를 담는 배열
    static void func(int k, int[] align, int[] picked, BufferedWriter bw) throws IOException{
        if(k==M){
            // picked 배열 출력
            for(int i=0; i<M; i++){
                bw.write(align[picked[i]]+ " ");
            }bw.newLine();
            return;
        }
        else {
            for(int i=0; i<N; i++){
                picked[k]=i;
                func(k+1, align, picked, bw);
            }
        }
    }
}

/*
n하고 m입력받고
align 배열에 수열을 저장
align을 sort한다.

func정의
k, align[], pciked[]
k=선택할 숫자 index
align[]= 선택할 수 있는 모든 숫자 배열
picked[]= 선택한 숫자배열

k==m picked[] 배열을 출력한다.

k<m k번째 숫자를 선택한다.
    picked[] 마지막으로 넣은 숫자 보다 큰 숫자부터 확인
    picked[]에 넣고
    func(k+1)을 호출
    
 */

