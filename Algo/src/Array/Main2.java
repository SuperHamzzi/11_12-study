package Array;

import java.util.Scanner;

public class Main2 {
    int solution(int a,int[] arr){
        int answer = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(i==0) {
                answer++;
                max=arr[i];
            }else{
                if(arr[i]>max) {
                    answer++;
                    max = arr[i];
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i =0; i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(T.solution(a,arr));
    }
}
