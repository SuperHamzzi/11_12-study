package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Integer> solution(int a, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i =1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                answer.add(arr[i]);
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] =  sc.nextInt();
        }
        for(int x : T.solution(a,arr)){
            System.out.print(x+" ");
        }
    }


}
