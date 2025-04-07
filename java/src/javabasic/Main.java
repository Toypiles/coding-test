package javabasic;
import java.io.*;
import java.util.*;

public class Main {

	public static int[] prefixSum(int[] arr){
		int n = arr.length;
		int[] prefix = new int[n+1];
		for(int i=1; i<=n; i++){
			prefix[i]=prefix[i-1]+ arr[i-1];
		}
		return prefix;
	}

	public static int getRangeSum(int[] prefix, int left, int right){
		return prefix[right+1] - prefix[left];
	}

	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 1, 7};
        int[][] queries = {
            {1, 3},  // 2 + 4 + 1 = 7
            {0, 2},  // 3 + 2 + 4 = 9
            {2, 4}   // 4 + 1 + 7 = 12
        };
		int[] prefix = prefixSum(arr);
		for (int[] q : queries) {
			int sum = getRangeSum(prefix, q[0], q[1]);
			System.out.println(sum);
		}
		System.out.println(getRangeSum(prefix, 1, 3));
	}
}