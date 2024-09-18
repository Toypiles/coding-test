# coding-test
코테 준비
*s5...s3 s#500.. -@$me %ko


백준 2776
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T= scanner.nextInt();
		for(int i=0; i<T; i++){
		    solve();
		}
	}	
	public static void solve(){
	    Scanner scanner = new Scanner(System.in);
	    int N= scanner.nextInt();
	    int[] note1= new int[N];
	    for(int i=0; i<N; i++){
	        note1[i]= scanner.nextInt();
	    }
	    
	    int M= scanner.nextInt();
	    int [] note2= new int[M];
	    for(int i=0; i<M; i++){
	        note2[i]= scanner.nextInt();
	    }
	    for(int i=0; i<M; i++){
	        boolean isFound = false;
	        for(int j=0; j<N; j++){
	            if(note1[j]==note2[i]){
	                isFound = true;
	            }
	        }
	        if(isFound){
	            System.out.println(1);
	        }
	        else{
	            System.out.println(0);
	        }
	    
	    }
	}
	
}
