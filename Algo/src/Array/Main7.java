package Array;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int jumsu = 0;
        int answer= 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                jumsu++;
                answer +=jumsu;
            }else{
                jumsu =0;
            }
        }
        System.out.println(answer);

    }
}
