package javabasic.baekjoon;
import java.util.*;
public class fire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for(int n=0; n<testCase; n++){
            int w = scanner.nextInt(); // cols
            int h = scanner.nextInt(); // row
            char[][] arr = new char[h][w];
            for(int i=0; i<arr.length; i++){
                String input = scanner.next();
                for(int j=0; j<arr[i].length; j++){
                    arr[i][j]=  input.charAt(j);
                }
            }

            int result = solved(arr);
            if(result==-1){
                System.out.println("IMPOSSIBLE");
            } else{
                System.out.println(result);
            }

        }
        scanner.close();
    }
    static int solved(char[][] arr){
        Queue<Point> fireQueue = new ArrayDeque<>();
        Queue<Point> personQueue = new ArrayDeque<>();
        //dx dy는 상하좌우를 의미함.
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        int h = arr.length;
        int w = arr[0].length;
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(arr[i][j]=='*'){
                    fireQueue.add(new Point(i, j));
                } else if(arr[i][j]=='@'){
                    personQueue.add(new Point(i, j));
                }
            }
        }
        
        int result=0;
        while (!personQueue.isEmpty()){
            int personQueueLength= personQueue.size();
            for(int i=0; i<personQueueLength; i++){
                Point nowPoint=personQueue.poll();
                if(nowPoint.r<0 || nowPoint.r>=h||nowPoint.c<0|| nowPoint.c>=w){
                    return result;
                }
                if(arr[nowPoint.r][nowPoint.c]!='@'){
                    continue;
                }
                
                for (int dir=0 ; dir<4 ; dir++) {
                    int nr = nowPoint.r + dx[dir];
                    int nc = nowPoint.c + dy[dir];
                    if(nr<0 || nr>=h || nc<0 || nc>=w){
                        personQueue.add(new Point(nr, nc));
                    } else {
                        if(arr[nr][nc]=='.'){
                            personQueue.add(new Point(nr, nc));
                            arr[nr][nc]='@';
                        }
                    }
                    
                }
            }

            int fireQueueLength = fireQueue.size();
            for(int j=0; j<fireQueueLength; j++){
                Point nowPoint = fireQueue.poll();
                for(int dir=0; dir<4; dir++){
                    int nr = nowPoint.r+ dx[dir];
                    int nc= nowPoint.c + dy[dir];
                    if(nr<0 || nr>=h || nc<0 || nc>=w){
                        continue;
                    }
                    if(arr[nr][nc]=='.' || arr[nr][nc]=='@'){
                        fireQueue.add(new Point(nr, nc));
                        arr[nr][nc]='*';
                    }
                }
            }
            
            result++;
        }
        return -1;
    }
    //좌표값 한세트를 의미함
    static class Point{
        public int r;
        public int c;
        Point(int r, int c){
            this.r=r;
            this.c=c;
        }
    }
}