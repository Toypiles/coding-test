import java.util.*;
public class color{
    static int N;
    static boolean[] visited;
    static char[][] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N=scanner.nextInt();
        visited = new boolean[N];
        for(int i=0; i<N; i++){
            String input = scanner.next();
            for(int j=0; j<N; j++){
                arr[i][j]=input.charAt(i);
            }
        }
        
        scanner.close();
    }


    static void dfs(int node){
        
        visited[node]=true;

        for(int r : arr[node]){
            if(!visited[r]){
                dfs(node);
            }
        }
    }

    static class Point{
        int x;
    }

}