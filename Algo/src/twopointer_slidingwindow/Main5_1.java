package twopointer_slidingwindow;

import java.util.Scanner;

public class Main5_1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int m = n/2 +1;
        int answer=0,lt=1, rt = 1,sum =0;
        for(int i=1; i<=m;i++){
            sum += i;
            if(sum==n) answer ++;
            while(sum>=n){
                sum -= rt;
                rt++;
                if(sum==n) answer ++;
            }
        }
        System.out.println(answer);
    }
}
