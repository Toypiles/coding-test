import java.util.*;
public class diamond2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num= 2*n-1;
        for(int i=0; i<n-1; i++){
            for(int j=n-1; j>i; j--){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            for(int j=n-1; j>i; j--){
                System.out.print(" ");
            }System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=num; j>0; j--){
                System.out.print("*");
            }
            num-=2;
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
