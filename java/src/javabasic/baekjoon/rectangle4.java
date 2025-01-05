import java.util.*;
public class rectangle4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n; i++){
            if(i==0 || i==n-1 || i==n/2){
                for(int j=0; j<n; j++){
                    System.out.print("*");
                }
            } else {
                for(int k=0; k<n; k++){
                    if(k==0 || k==n-1 || k==n/2 || k==i || k==n-1-i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
