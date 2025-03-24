package javabasic;
import java.io.*;
import java.util.*;

public class Main {
	public static int[] parent;
	public static int[] trueP;
	public static int result;
	public static ArrayList<Integer>[] party;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int m= scanner.nextInt();
		int t = scanner.nextInt();
		trueP= new int[t];
		for(int i=0; i<t; i++){
			trueP[i]=scanner.nextInt();
		}
		parent= new int[n+1];
		for(int i=1; i<=n; i++){
			parent[i]=i;
		}
		party= new ArrayList[m];
		for(int i=0; i<m; i++){
			party[i]= new ArrayList<Integer>();
			int party_size= scanner.nextInt();
			for(int j=0; j<party_size; j++){
				party[i].add(scanner.nextInt());
			}
		}
		for(int i=0; i<m; i++){
			int first = party[i].get(0);
			for(int j=1; j<party[i].size(); j++){
				union(first, party[i].get(j));
			}
		}
		for(int i=0; i<m; i++){
			boolean isPossible =true;
			int cur = party[i].get(0);
			for(int j=0; j<trueP.length; j++){
				if(find(cur)==find(trueP[j])){
					isPossible=false;
					break;
				}
			}
			if(isPossible) result++;
		}
		System.out.println(result);
	}

	public static void union(int a, int b){
		a=find(a);
		b=find(b);
		if(a!=b){
			parent[b]=a;
		}
	}

	public static int find(int a){
		if(a==parent[a]){
			return a;
		} else{
			return parent[a]=find(parent[a]);
		}
	}
}