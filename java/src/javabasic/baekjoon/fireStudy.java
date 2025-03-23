package javabasic.baekjoon;
import java.util.*;
public class fireStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int t=0; t<testCase; t++){
            int h = sc.nextInt();
            int w= sc.nextInt();
            char[][] arr = new char[w][h];
            for(int i=0; i<w; i++){
                String input = sc.next();
                for(int j=0; j<h; j++){
                    arr[i][j]=input.charAt(j);
                }
            }
            int result = solved(arr);
            if(result==-1){
                System.out.println("IMPOSSIBLE");
            } else{
                System.out.println(result);
            }
        }
        sc.close();
    }

    static int solved(char[][] arr){
        Queue<Point> personQueue = new ArrayDeque<>();
        Queue<Point> firQueue = new ArrayDeque<>();
        int w = arr.length;
        int h = arr[0].length;
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        for(int i=0; i<w; i++){
            for(int j=0; j<h; j++){
                if(arr[i][j]=='@'){
                    personQueue.add(new Point(i, j));
                }else if(arr[i][j]=='*'){
                    firQueue.add(new Point(i, j));
                }
            }
        }
        int result=0;
        while (!personQueue.isEmpty()) {
            int personQueueLength = personQueue.size();
            for(int i=0; i<personQueueLength; i++){
                Point nowPoint = personQueue.poll();
                // 사람이 나갔다는 것을 의미함
                if(nowPoint.x<0 || nowPoint.x>=w || nowPoint.y<0 || nowPoint.y>=h){
                    return result;
                }
                if(arr[nowPoint.x][nowPoint.y]!='@'){
                    continue;
                }
                for(int dir=0; dir<4; dir++){
                    int nx = nowPoint.x + dx[dir];
                    int ny = nowPoint.y + dy[dir];
                    if(nx<0 || nx>=w || ny<0 || ny>=h){
                        personQueue.add(new Point(nx, ny));
                    } else{
                        if(arr[nx][ny]=='.'){
                            personQueue.add(new Point(nx, ny));
                            arr[nx][ny]='@';
                        }
                    }

                }
            }

            int fireQueueLength = firQueue.size();
            for(int j=0; j<fireQueueLength; j++){
                Point nowPoint = firQueue.poll();
                for(int dir=0; dir<4; dir++){
                    int nx= nowPoint.x + dx[dir];
                    int ny = nowPoint.y + dy[dir];
                    if(nx<0 || nx>=w || ny<0 || ny>=0){
                        continue;
                    }
                    if(arr[nx][ny]=='@' || arr[nx][ny]=='.'){
                        firQueue.add(new Point(nx, ny));
                        arr[nx][ny]='*';
                    }
                }
            }
            result++;
        }
        return -1;
    }

    static class Point{
        public int x;
        public int y;
        Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
}
