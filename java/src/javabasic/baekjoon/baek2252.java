package javabasic.baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baek2252 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int m= scanner.nextInt();
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		for(int i=0; i<=n; i++){
			A.add(new ArrayList<>());
		}
		int[] indegree = new int[n+1];
		for(int i=0; i<m; i++){
			int s= scanner.nextInt();
			int e= scanner.nextInt();
			A.get(s).add(e);
			indegree[e]++;
		}

		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<=n; i++){
			if(indegree[i]==0){
				queue.offer(i);
			}
		}
		while (!queue.isEmpty()) {
			int now = queue.poll();
			System.out.print(now+" ");
			for(int next : A.get(now)){
				indegree[next]--;
				if(indegree[next]==0){
					queue.offer(next);
				}
			}
		}
	}
}
