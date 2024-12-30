import java.util.*;;
public class maximumValue {
    static int[][] arr;
    static int[][] maxValue;
    static int maximum,result;
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        arr= new int[10][10];
        maxValue= new int[10][10];
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
                arr[i][j]=scanner.nextInt();
                maxValue[i][j]= arr[i][j];
            }
        }
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
                if(maxValue[i][j]>maxValue[0][0]){
                    maxValue[0][0]=maxValue[i][j];
                    maximum= maxValue[0][0];
                }
            }
        }
        System.out.println(maximum);
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
                if(maximum==maxValue[i][j]){
                    System.out.println(i+" "+j);
                }
            }
        }
        scanner.close();
    }
}
