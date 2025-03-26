package javabasic.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baek1516 {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		for(int i=0; i<=n; i++){
			A.add(new ArrayList<>());
		}
		int[] indegree = new int[n+1];
		int[] selfBuild = new int[n+1];
		for(int i=1; i<=n; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			selfBuild[i]=Integer.parseInt(st.nextToken());
			while (true) {
				int preTemp = Integer.parseInt(st.nextToken());
				if(preTemp==-1){
					break;
				}
				A.get(preTemp).add(i);
				indegree[i]++;
			}
		}
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<=n; i++){
			if(indegree[i]==0){
				queue.offer(i);
			}
		}
		int[] result = new int[n+1];
		while (!queue.isEmpty()) {
			int now = queue.poll();
			for(int next : A.get(now)){
				indegree[next]--;
				result[next]=Math.max(result[next], result[now]+selfBuild[now]);
				if(indegree[next]==0){
					queue.offer(next);
				}
			}
		}
		for(int i=1; i<=n; i++){
			System.out.println(result[i]+selfBuild[i]);
		}
	}
}
/*
 * 건물의 종류의 수 n
건물의 생산 시간
10 10 4 4 3
진입 차수 리스트
1- 2 3 4
2
3 - 4 5
4
5
0 1 1 2 1
정답 리스트
0 0 0 0 0
건물을 짓는데 최대 시간
math.max(현재 건물에 저장된 최대 시간, 이전 건물에 저장된 최대 시간+현재 건물의 생산시간)
진입 차수 배열
0 0 0 1 1
0 0 0 0 0
정답 배열
0 10 10 10 0 
0 10 10 14 14
자기 건물이 짓는데 걸리는 시간
10 20 14 18 17
 */

