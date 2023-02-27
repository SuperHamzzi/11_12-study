package Array;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc. nextInt();
        int answer = 0;
        int[][] arr = new int[n+2][n+2];
        for(int i=1; i<n+1; i++){
            for(int j=1;j<n+1; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int j=1; j<n+1; j++){
            for(int k=1;k<n+1; k++){
                if(arr[j][k]>arr[j-1][k] && arr[j][k]>arr[j+1][k] && arr[j][k]>arr[j][k-1] && arr[j][k]>arr[j][k+1]){
                    answer ++;
                }
            }
        }
        System.out.println(answer);


    }
}
