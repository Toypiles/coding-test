package javabasic.baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baek2251 {
    static int[] Sender={0,0,1,1,2,2};
	static int[] Receiver={1,2,0,2,0,1};
	static int[] now;
	static boolean visited[][];
	static boolean answer[];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		now= new int[3];
		now[0]=scanner.nextInt();
		now[1]=scanner.nextInt();
		now[2]=scanner.nextInt();
		visited= new boolean[201][201];
		answer= new boolean[201];
		BFS();
		for(int i=0; i<answer.length; i++){
			if(answer[i]){
				System.out.print(i+" ");
			}
		}
	}

	public static void BFS(){
		Queue<AB> queue = new LinkedList<>();
		queue.add(new AB(0, 0));
		visited[0][0]=true;
		answer[now[2]]=true;
		while (!queue.isEmpty()) {
			AB p = queue.poll();
			int A = p.A;
			int B= p.B;
			int C = now[2]-A-B;
			for(int k=0; k<6; k++){
				int[] next = {A,B,C};
				next[Receiver[k]]+=next[Sender[k]];
				next[Sender[k]]=0;
				if(next[Receiver[k]]>now[Receiver[k]]){
					next[Sender[k]]= next[Receiver[k]]-now[Receiver[k]];
					next[Receiver[k]]=now[Receiver[k]];
				}
				if(!visited[next[0]][next[1]]){
					visited[next[0]][next[1]]=true;
					queue.add(new AB(next[0], next[1]));
					if(next[0]==0){
						answer[next[2]]=true;
					}
				}
			}
		}
	}

}

class AB{
	int A;
	int B;
	public AB(int A, int B){
		this.A=A;
		this.B=B;
	}
}
