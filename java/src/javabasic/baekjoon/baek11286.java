package javabasic.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class baek11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->{
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs==second_abs){
                return o1>o2? 1:-1;
            }
            else{
                return first_abs - second_abs;
            }
        });

        for(int i=0; i<n; i++){
            int r = Integer.parseInt(br.readLine());
            if(r==0){
                if(pq.isEmpty()){
                    System.out.println("0");
                }
                else{
                    System.out.println(pq.poll());
                }
            } else{
                pq.add(r);
            }
        }
        
    }
}
