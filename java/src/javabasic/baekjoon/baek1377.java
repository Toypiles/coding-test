package javabasic.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baek1377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        mData[] arr = new mData[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=new mData(Integer.parseInt(br.readLine()), i);
        }
        Arrays.sort(arr);
        int max=0;
        for(int i=0; i<n; i++){
            if(max<arr[i].index-i){
                max=arr[i].index-i;
            }
        }
        System.out.println(max+1);
        
    }

    static class mData implements Comparable<mData> {
        int index;
        int value;
        public mData(int value, int index){
            super();
            this.value=value;
            this.index=index;
        }

        @Override
        public int compareTo(mData o){
            return this.value - o.value;
        }
    }
}
