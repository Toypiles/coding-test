import java.util.Scanner;

public class cuttingPaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for(int i=1; i<=m; i++){
            if(i==1 || i==m){
                for(int j=1; j<=n; j++){
                    if(j==1 || j==n){
                        System.out.print("+");
                    }else{
                        System.out.print("-");
                    }
                }System.out.println();
            } else{
                for(int j=1; j<=n; j++){
                    if(j==1 || j==n){
                        System.out.print("|");
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println();
            }
        }
        scanner.close();
    }
}