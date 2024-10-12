import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n; i++){
            int p = scanner.nextInt();
            scanner.nextLine();
            String[] C = scanner.nextLine().split(" ");
            int cmp = Integer.parseInt(C[0]);
            String result = C[1];
            for(int j=2; j<=p; j++){
                String[] sp = scanner.nextLine().split(" ");
                if(Integer.parseInt(sp[0])>cmp){
                    cmp=Integer.parseInt(sp[0]);
                    result = sp[1];
                }
            }
            System.out.println(result);
        }
        scanner.close();
    }
}