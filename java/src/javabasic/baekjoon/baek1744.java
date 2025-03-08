package javabasic.baekjoon;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class baek1744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPq = new PriorityQueue<>();
        int one =0;
        int zero =0;
        int sum=0;
        for(int i=0; i<n; i++){
            int data = scanner.nextInt();
            if(data>1){
                plusPq.add(data);
            } else if(data==0){
                zero++;
            } else if(data==1){
                one++;
            } else{
                minusPq.add(data);
            }
        }
        while (plusPq.size()>1) {
            int first = plusPq.remove();
            int second = plusPq.remove();
            sum += first*second;
        }
        if(!plusPq.isEmpty()){
            sum+=plusPq.remove();
        }
        while (minusPq.size()>1) {
            int first = minusPq.remove();
            int second = minusPq.remove();
            sum+= first*second;
        }
        if(!minusPq.isEmpty()){
            if(zero==0){
                sum+=minusPq.remove();
            }
        }
        sum+=one;
        System.out.println(sum);

    }
}
