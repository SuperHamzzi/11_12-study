package twopointer_slidingwindow;

import java.util.Scanner;

public class Main3 {
     private int solution(int n, int m, int[] arr) {
         int max = 0;
         for(int i=0; i<n-m; i++){
             int max2 = 0;
             for(int j=i; j<i+m; j++){
                 max2 += arr[j];
             }
             max  = Math.max(max,max2);
         }
         return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main3 T = new Main3();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }


}
