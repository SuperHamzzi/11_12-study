package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main6 T = new Main6();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x:T.solution(n,arr)){
            System.out.print(x+" ");
        }
    }

    private ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<n;i++){
            int tmp=arr[i];
            int res = 0;
            while(tmp>0) {
                int t = tmp % 10;
                tmp = tmp / 10;
                res = res*10 + t;
            }
            if(isPrime(res)) answer.add(res);
        }

        return answer;
    }
    public boolean isPrime(int num){
            if(num==1) return false;
            for(int i=2; i<num; i++){
                if(num%i==0) return false;
            }
        return true;
    }
}
