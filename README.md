# coding-test
코테 준비
solved.ac
*b3...s5 s#500.. -@$me %ko


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

백준 20299
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//N은 팀의 수
		int N = scanner.nextInt();
	    //K는 팀원 3명의 레이팅 합에 대한 클럽 가입 조건
	    int K= scanner.nextInt();
	    //l은 개인 레이팅에 대한 클럽 가입 조건
	    int L= scanner.nextInt();
	    int correct=0;
	    int[] cL= new int[N*3];
	    
	    for(int i=0; i<N; i++){
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        int c = scanner.nextInt();
	        int sum= a+b+c;
	        if(sum>=K && a>=L && b>=L && c>=L){
	           cL[correct*3] = a;
	           cL[correct*3+1] =b;
	           cL[correct*3+2]=c;
	           correct++;
	        }
	    }
	    System.out.println(correct);
	    for(int i=0; i<correct*3; i++){
	        System.out.print(cL[i]+" ");
	    }
	}
}


BufferReader BufferWriter example
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++){
		    st= new StringTokenizer(br.readLine());
		    bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		bw.close();
	}
}

1251 다시풀기
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		for(int i=0; i<a.length; i++){
		    for(int j=0; j<b.length; j++){
		        if(a.indexOf("0") != -1){
		            System.out.print(0);
		        } else{
		            System.out.print(1);
		        }
		    }
		}
	}


 8892
 import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new scanner(System.in);
		int T = scanner.nextInt();
		for(int i=0; i<T; i++){
		    int k= scanner.nextInt();
		    for(int j=0; j<k; j++){
		        String s = scanner.nextLine();
		        if(s>= a && s<=z){
		           String reverse ="";
		           for(int z=s.length()-1; z>=0; z--){
		               reverse=reverse+s.charAt(z);
		           }
		           if(sum == reverse){
		               
		           }
		           else{
		               System.out.println(0);
		           }
		        }
		        else{
		            
		        }
		    }
		    
		}
	}
}
}
https://hongong.hanbit.co.kr/java-%EC%9E%90%EB%B0%94-%EB%AC%B8%EC%9E%90%EC%97%B4%EC%9D%84-%EB%8B%A4%EB%A3%A8%EB%8A%94-string-%ED%81%B4%EB%9E%98%EC%8A%A4-%EB%A9%94%EC%86%8C%EB%93%9C-%EC%B4%9D%EC%A0%95%EB%A6%AC/
