import java.util.*;
public class nAndM2 {
    static int N, M;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M= scanner.nextInt();
        int[] arr = new int[10];
        boolean[] isUsed = new boolean[10];
        func(0, arr, isUsed);
        scanner.close();
    }

    static void func(int x, int[] arr, boolean[] isUsed){
        if(x==M){
            for(int i=0; i<M; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        } else {
            // int smallest = arr.isEmpty ? 0 : arr[x-1]+1;
            int smallest;
            if(x==0){
                smallest =1;
            } else {
                smallest= arr[x-1]+1;
            }
            for(int k=smallest; k<=N; k++){
                if(!isUsed[k]){
                    arr[x]=k;
                    isUsed[k]=true;
                    func(x+1, arr, isUsed);
                    isUsed[k]= false;
                }

            }
        }
    }

}
