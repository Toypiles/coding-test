package javabasic.baekjoon;
import java.util.*;
public class verticalRead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] arr = new char[5][6];
        for(int i=0; i<arr.length; i++){
            String input = scanner.nextLine();
            for(int j=0; j<arr[0].length; j++){
                if(j<input.length()){
                    arr[i][j]=input.charAt(j);
                } else {
                    arr[i][j]=' ';
                }
            }
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==' '){
                    continue;
                }
                System.out.print(arr[j][i]);
            }
        }

        scanner.close();
    }
}
