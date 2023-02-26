package Array;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            int jumsu = 1;
            for(int j=0; j<n; j++){
                if(arr[j]>arr[i]){
                    jumsu++;
                }
            }
            answer[i] = jumsu;
        }
        for(int k=0; k<n; k++){
            System.out.print(answer[k]+" ");
        }
    }
}
