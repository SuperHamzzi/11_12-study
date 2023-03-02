package twopointer_slidingwindow;

import java.util.Scanner;

public class Main3_1 {
    public int solution(int n, int m, int[] arr) {
        int max = 0, sum =0;
        for(int i=0; i<m; i++) sum += arr[i];
        max = sum;
        for(int i=m; i<n; i++){
            sum+=(arr[i]-arr[i-m]);
            max= Math.max(sum,max);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main3_1 T = new Main3_1();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }
}
