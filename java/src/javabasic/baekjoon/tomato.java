package javabasic.baekjoon;
import java.util.*;
public class tomato {
    static int M, N;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        M=scanner.nextInt();
        N=scanner.nextInt();
        int[][] arr = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j]= scanner.nextInt();
            }
        }
        System.out.println(solved(arr));
        scanner.close();
    }

    static int solved(int[][]arr){
        Queue<Point> tomato = new ArrayDeque<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]==1){
                    tomato.add(new Point(i, j));
                }
            }
        }
        int result =-1;
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,-1,1};
        while (!tomato.isEmpty()) {
            int tomatoSize = tomato.size();
            for(int i=0; i<tomatoSize; i++){
                Point nowPoint = tomato.poll();
                for(int dir =0; dir<4; dir++){
                    int nx = nowPoint.x +dx[dir];
                    int ny = nowPoint.y +dy[dir];
                    if(nx<0 || nx>=N || ny<0 || ny>=M){
                        continue;
                    }
                    if(arr[nx][ny]!=0){
                        continue;
                    }
                    arr[nx][ny]=1;
                    tomato.add(new Point(nx, ny));
                }
            }
            result++;
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]==0){
                    return -1;
                }
            }
        }
        return result;
    }

    static class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
}
