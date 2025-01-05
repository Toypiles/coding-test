import java.util.*;
public class parallelogram2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int k = scanner.nextInt();
        String d = scanner.next();
        for(int i=0; i<h; i++){
            //0 1 2 3 4  input L
            if(d.equals("L")){
                for(int j=0; j<i; j++){
                    System.out.print(" ");
                }
                for(int j=0; j<k; j++){
                    System.out.print("*");
                } System.out.println();
            }
            //4 3 2 1 0 input R
            if(d.equals("R")){
                for(int j=h-1; j>i; j--){
                    System.out.print(" ");
                }
                for(int j=0; j<k; j++){
                    System.out.print("*");
                } System.out.println();
            }
        }
        scanner.close();
    }
}
