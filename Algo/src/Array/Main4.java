package Array;

import java.util.Scanner;

public class Main4 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<n;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        for(int x: arr){
            System.out.print(x +" ");
        }
    }
}
