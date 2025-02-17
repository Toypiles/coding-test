package javabasic.baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class baek12891 {
    static int[] checkArr;
    static int[] myArr;
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] A=new char[S];
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret=0;
        int result =0;
        //2번째 한줄 입력
        A=br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        //A C G T 개수 입력
        for(int i=0; i<4; i++){
            checkArr[i]=Integer.parseInt(st.nextToken());
            if(checkArr[i]==0){
                checkSecret++;
            }
        }

        for(int i=0; i<P; i++){
            Add(A[i]);
        }
        if(checkSecret==4){
            result++;
        }

        for(int i=P; i<S; i++){
            int j=i-P;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret==4){
                result++;
            }
        }
        System.out.println(result);
        br.close();
    }

    private static void Add(char c){
        switch (c) {
            case 'A':
                myArr[0]++;
                if(checkArr[0]==myArr[0]){
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if(checkArr[1]==myArr[1]){
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if(checkArr[2]==myArr[2]){
                    checkSecret++;
                }
                break;
            case 'T':
                myArr[3]++;
                if(checkArr[3]==myArr[3]){
                    checkSecret++;
                }
                break;
        }
    }

    private static void Remove(char c){
        switch (c) {
            case 'A':
                if(checkArr[0]==myArr[0]){
                    checkSecret--;
                }
                myArr[0]--;
                break;
            case 'C':
                if(checkArr[1]==myArr[1]){
                    checkSecret--;
                }
                myArr[1]--;
                break;
            case 'G':
                if(checkArr[2]==myArr[2]){
                    checkSecret--;
                }
                myArr[2]--;
                break;
            case 'T':
                if(checkArr[3]==myArr[3]){
                    checkSecret--;
                }
                myArr[3]--;
                break;
        }
    }
}
