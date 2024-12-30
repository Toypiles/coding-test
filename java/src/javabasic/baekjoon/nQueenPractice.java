import java.util.*;
public class nQueenPractice {
    static int N, count;
    static boolean[] col;
    static boolean[] diag1;
    static boolean[] diag2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N= scanner.nextInt();
        count = 0;
        col = new boolean[N];
        diag1 = new boolean[2*N-1];
        diag2 = new boolean[2*N-1];
        numberOfCases(0);
        System.out.println(count);
        scanner.close();
    }
    static void numberOfCases(int y){
        if(y==N){
            count++;
            return;
        }
        for(int x=0; x<N; x++){
            if(col[x] || diag1[x+y] ||  diag2[x-y+N-1]){
                continue;
            }
            col[x]=true;
            diag1[x+y]=true;
            diag2[x-y+N-1]=true;
            numberOfCases(y+1);
            col[x]=false;
            diag1[x+y]=false;
            diag2[x-y+N-1]=false;
        }
    }
}
