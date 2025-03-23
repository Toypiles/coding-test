package javabasic.baekjoon;
import java.util.*;
public class zigzag {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int r = sc.nextInt();
		for (int k = 0; k < r; k++) {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
			for (int i = h-2; i >= 0 ; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		}
	}
}


/*for(int q=0; q<r; q++){
            for(int i=0; i<h; i++){
                for(int j=0; j<i; j++){
                    System.out.print(" ");
                }
                for(int j=0; j<1; j++){
                    System.out.print("*");
                }System.out.println();
            }
            for(int i=0; i<h-1; i++){
                for(int j=1; j>i; j--){
                    System.out.print(" ");
                }
                for(int j=0; j<1; j++){
                    System.out.print("*");
                }System.out.println();
            }
        } */