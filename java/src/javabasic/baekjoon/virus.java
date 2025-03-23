package javabasic.baekjoon;
import java.util.*;
public class virus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computer =  scanner.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i=0 ; i<computer+1 ; i++) {
            ArrayList<Integer> innerArray = new ArrayList<>();
            arr.add(innerArray); // 빈 배열을 넣어줌
        }
        boolean[] isInfected = new boolean[computer+1];
        
        int network = scanner.nextInt();
        for(int k=0; k<network; k++){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            arr.get(u).add(v);
            arr.get(v).add(u);
        }
        infect(1, isInfected);
        spread(1, arr, isInfected);
        int result =0;
        for(int i=2; i<isInfected.length; i++){
            if(isInfected[i]){
                result++;
            }
        }
        System.out.println(result);
        scanner.close();
    }

    static void infect(int x, boolean[] isInfected){
        isInfected[x]=true;
    }

    static void spread(int x, ArrayList<ArrayList<Integer>> arr, boolean[] isInfected){
        for(int i=0; i<arr.get(x).size(); i++){
            int next = arr.get(x).get(i);
            if(isInfected[next]){
                continue;
            }
            infect(next, isInfected);
            spread(next, arr, isInfected);
        }
    }
}
