package javabasic.baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baek1167 {
    static boolean visited[];
    static int[] distance;
    static ArrayList< Edge>[] A;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        A= new ArrayList[n+1];
        for(int i=1; i<=n; i++){
            A[i]= new ArrayList< Edge>();
        }
        for(int i=0; i<n; i++){
            int s = scanner.nextInt();
            while (true) {
                int e= scanner.nextInt();
                if(e==-1){
                    break;
                }
                int v = scanner.nextInt();
                A[s].add(new Edge(e, v));
            }
        }
        distance = new int[n+1];
        visited= new boolean[n+1];
        BFS(1);
        int max =1;
        for(int i=2; i<=n; i++){
            if(distance[max]<distance[i]){
                max=i;
            }
        }
        distance = new int[n+1];
        visited= new boolean[n+1];
        BFS(max);
        Arrays.sort(distance);
        System.out.println(distance[n]);

    }

    private static void BFS(int index){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(index);
        visited[index]=true;
        while (!queue.isEmpty()) {
            int now_Node = queue.poll();
            for(Edge i : A[now_Node]){
                int e = i.e;
                int v = i.value;
                if(!visited[e]){
                    visited[e]=true;
                    queue.add(e);
                    distance[e]=distance[now_Node]+v;
                }
            }
        }
    }
}

class Edge {
    int e;
    int value;
    public Edge(int e, int value){
        this.e=e;
        this.value=value;
    }
}