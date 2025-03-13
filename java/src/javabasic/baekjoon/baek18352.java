package javabasic.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class baek18352 {
    static int visited[];
	static int n,m,k,x;
	static ArrayList<Integer>[] A;
	static List<Integer> answer;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();
		m=scanner.nextInt();
		k=scanner.nextInt();
		x=scanner.nextInt();
		A= new ArrayList[n+1];
		answer = new ArrayList<>();
		for(int i=1; i<=n; i++){
			A[i]= new ArrayList<Integer>();
		}
		for(int i=0; i<m; i++){
			int s= scanner.nextInt();
			int e= scanner.nextInt();
			A[s].add(e);
		}
		visited= new int[n+1];
		for(int i=0; i<=n; i++){
			visited[i]=-1;
		}
		BFS(x);
		for(int i=0; i<=n; i++){
			if(visited[i]==k){
				answer.add(i);
			}
		}
		if(answer.isEmpty()){
			System.out.println("-1");
		}
		else{
			Collections.sort(answer);
			for(int t : answer){
				System.out.println(t);
			}
		}
	}

	private static void BFS(int node){
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(node);
		visited[node]++;
		while (!queue.isEmpty()) {
			int now_Node = queue.poll();
			for(int i: A[now_Node]){
				if(visited[i]==-1){
					visited[i]=visited[now_Node]+1;
					queue.add(i);
				}
			}
		}
	}
}
