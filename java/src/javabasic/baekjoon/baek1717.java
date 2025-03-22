package javabasic.baekjoon;

import java.util.Scanner;

public class baek1717 {
    public static int[] parent;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int m= scanner.nextInt();
		parent=new int[n+1];
		for(int i=0; i<=n; i++){
			parent[i]=i;
		}
		for(int i=0; i<m; i++){
			int q = scanner.nextInt();
			int a= scanner.nextInt();
			int b= scanner.nextInt();
			if(q==0){
				union(a, b);
			} else{
				if(checkSame(a, b)){
					System.out.println("YES");
				} else{
					System.out.println("NO");
				}
			}
		}
		
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
	public static boolean checkSame(int a, int b){
		a=find(a);
		b=find(b);
		if(a==b){
			return true;
		} else{
			return false;
		}
	}
}