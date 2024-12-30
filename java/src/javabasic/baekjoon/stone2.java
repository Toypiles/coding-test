import java.util.*;
public class stone2 {
    static int N;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        for(int i=0; i<=N ; i++) {
            cache[i] = -1;
        }
        if(isWin(N)){
            System.out.println("SK");
        } else{
            System.out.println("CY");
        }
        scanner.close();
    }
    static int[] cache = new int[1001];
    //x는 남은 돌을 의미함.
    static boolean isWin(int N){
        if(N==1 || N==3){
            return false;
        }
        if (cache[N] != -1) {
            if (cache[N] == 1) return true;
            else return false;
        }
        if(isWin(N-1)==false || isWin(N-3)==false){
            return true;
        }
        cache[N] = 0;
        return false;
    }
}
