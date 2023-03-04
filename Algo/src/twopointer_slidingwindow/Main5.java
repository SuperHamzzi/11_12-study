package twopointer_slidingwindow;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc. nextInt();
        int answer =0;
        int dy = 1;
        int sum = 0;
        for(int i=1; i<n; i++){

            sum += i;
            if(sum == n) {
                answer++;
            }
            while(sum >= n){
                sum -= dy;
                dy++;
                if(sum == n){
                    answer ++;
                }
            }

        }
        System.out.println(answer);
    }
}
