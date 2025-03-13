package javabasic.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baek1325 {
    static int n,m;
	static boolean visited[];
	static ArrayList<Integer>[] A;
	static int answer[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n= Integer.parseInt(st.nextToken());
		m= Integer.parseInt(st.nextToken());
		A= new ArrayList[n+1];
		answer= new int[n+1];
		for(int i=1; i<=n; i++){
			A[i]= new ArrayList<>();
		}
		for(int i=0; i<m; i++){
			st = new StringTokenizer(br.readLine());
			int s= Integer.parseInt(st.nextToken());
			int e= Integer.parseInt(st.nextToken());
			A[s].add(e);
		}
		for(int i=1; i<=n; i++){
			visited= new boolean[n+1];
			BFS(i);
		}
		int max=0;
		for(int i=1; i<=n; i++){
			max=Math.max(max, answer[i]);
		}
		for(int i=1; i<=n; i++){
			if(max==answer[i]){
				System.out.print(i+" ");
			}
		}
	}

	public static void BFS(int index){
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(index);
		visited[index]=true;
		while (!queue.isEmpty()) {
			int now_Node = queue.poll();
			for(int i : A[now_Node]){
				if(!visited[i]){
					visited[i]=true;
					answer[i]++;
					queue.add(i);
				}
			}
		}
	}
}
