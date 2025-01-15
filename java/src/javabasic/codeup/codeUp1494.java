package javabasic.codeup;
import java.util.*;
public class codeUp1494 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int k= scanner.nextInt();
        int[] d= new int[n+2];
        int[] result = new int[n+2];
        int sum=0;
        for(int i=1; i<=k; i++){
            int s= scanner.nextInt();
            int e= scanner.nextInt();
            int u= scanner.nextInt();
            d[s] = d[s]+u;
            d[e+1] = d[e+1]-u;
        }

        for(int i=1; i<=n; i++){
            System.out.print(d[i]+" ");
        }System.out.println();

        for(int i=1; i<=n; i++){
            sum+=d[i];
            result[i]=sum;
        }

        for(int i=1; i<=n; i++){
            System.out.print(result[i]+" ");
        }System.out.println();
    }
}
