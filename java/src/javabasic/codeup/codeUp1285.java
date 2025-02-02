package javabasic.codeup;

import java.util.Scanner;

public class codeUp1285 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String a = scanner.nextLine();
        char[] c = new char[a.length()];
        for(int i=0; i<a.length(); i++){
            c[i]=a.charAt(i);
            int[] convert = new int[a.length()];
            if(i%2==0){
                convert[i] = Character.getNumericValue(c[i]);
                System.out.println(convert[i]);
            }
            else{
                if(c[i]=='+' || )
            }
        }
    }
}
