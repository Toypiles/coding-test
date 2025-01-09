import java.util.Scanner;

public class whiteCheckboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] arr = new int[20][20];
        for(int q=1; q<=n; q++){
            int x =scanner.nextInt();
            int y = scanner.nextInt();
            arr[x][y]=1;
        }
        for(int i=1; i<=19; i++){
            for(int j=1; j<=19; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
