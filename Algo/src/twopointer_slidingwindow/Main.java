package twopointer_slidingwindow;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int lengt = Math.max(arr1.length,arr2.length);

        int dx = 0, dy =0;
        for(int i=0; i<lengt; i++){
            if(dx>=arr1.length){
                answer.add(arr2[dy]);
                dy++;
            }else if(dy>=arr2.length){
                answer.add(arr1[dx]);
                dx++;
            }else {
                if (arr1[dx] > arr2[dy]) {
                    answer.add(arr2[dy]);
                    dy++;
                } else if (arr1[dx] == arr2[dy]) {
                    answer.add(arr1[dx]);
                    answer.add(arr2[dy]);
                    dx++;
                    dy++;
                } else {
                    answer.add(arr1[dx]);
                    dx++;
                }
            }
        }

        return answer;


    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i =0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int j =0; j<m; j++){
            arr2[j] = sc.nextInt();
        }
        for(int x: T.solution(n,m,arr1,arr2)){
            System.out.println(x);
        }
    }


}
