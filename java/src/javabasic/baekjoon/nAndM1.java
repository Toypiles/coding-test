import java.util.*;
public class nAndM1 {
    static int N, M;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        int arr[]= new int[10];
        boolean [] vis = new boolean[10];
        func(0,arr,vis);

        scanner.close();
    }
    static void func(int k, int[] arr, boolean[] vis){
        if(k==M){
            for(int i=0; i<M; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        } else {
            for(int i=1; i<=N; i++){
                if(!vis[i]){
                    arr[k]=i;
                    vis[i]=true;
                    func(k+1, arr, vis);
                    vis[i]=false;
                }
            }
        }
    }
}
