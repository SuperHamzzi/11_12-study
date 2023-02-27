package Array;

import java.util.Scanner;

public class Main12 {

    public int solution(int a , int b, int[][] arr){
        int answer =0;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a; j++){
                    int cnt = 0;
                for(int k=0; k<b; k++){
                    for(int s=0; s<a; s++){
                        if(arr[b][a]==i)pi=cnt;
                        if(arr[b][a]==j)pj=cnt;

                }


            }
        }


        return answer;
    }
    public static void main(String[] args) {
        Main12 T = new Main12();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(a,b,arr));

    }
}
