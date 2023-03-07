package stack_queue;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr= new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] arr2 = new int[];
        for(int i=0; i<m; i++){
            arr2[i]  = sc.nextInt();
        }
        System.out.println(T.solution(n,arr,m,arr2));
    }

    private int solution(int n, int[][] arr, int m, int[] arr2) {
        int answer = 0;

        


        return answer;
    }
}
