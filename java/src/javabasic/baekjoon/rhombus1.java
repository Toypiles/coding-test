import java.util.*;
public class rhombus1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        for(int i=0; i<n; i++){
            // 4,3,2,1,0 " "
            for(int j=n-1; j>i; j--){
                System.out.print(" ");
            }
            // reverse  5,5 ~ 1,1 "*"
            for(int j=0; j<1; j++){
                System.out.print("*");
            }
            // 0,2,4,6,8 " "
            for(int j=0; j<2*i; j++){
                System.out.print(" ");
            }
            // 1,1 ~ 5,5 "*"
            for(int j=0; j<1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            // 0,1,2,3,4 " "
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<1; j++){
                System.out.print("*");
            }
            // 8,6,4,2,0 " "
            for(int j=(n-i-1)*2; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
	}
}