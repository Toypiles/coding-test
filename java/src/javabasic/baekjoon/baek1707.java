package javabasic.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baek1707 {
    static ArrayList<Integer>[] A;
	static boolean visited[];
	static boolean IsEven;
	static int[] check;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		for(int t=0; t<n; t++){
			String[] s = br.readLine().split(" ");
			int v = Integer.parseInt(s[0]);
			int e = Integer.parseInt(s[1]);
			A= new ArrayList[v+1];
			check= new int[v+1];
			IsEven=true;
			visited=new boolean[v+1];
			for(int i=1; i<=v; i++){
				A[i]= new ArrayList<Integer>();
			}
			for(int i=0; i<e; i++){
				s=br.readLine().split(" ");
				int start = Integer.parseInt(s[0]);
				int end = Integer.parseInt(s[1]);
				A[start].add(end);
				A[end].add(start);
			}
			for(int i=1; i<=v; i++){
				if(IsEven){
					DFS(i);
				}
				else{
					break;
				}
			}
			if(IsEven){
				System.out.println("YES");
			} else{
				System.out.println("NO");
			}
		}
		
	}

	public static void DFS(int node){
		visited[node]=true;
		for(int i: A[node]){
			if(!visited[i]){
				check[i]=(check[node]+1)%2;
				DFS(i);
			}
			else if(check[node]==check[i]){
				IsEven=false;
			}
		}
	}
}
