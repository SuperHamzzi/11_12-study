package stack_queue;

import java.util.Scanner;
import java.util.Stack;

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
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i]  = sc.nextInt();
        }
        System.out.println(T.solution(arr,arr2));
    }

    private int solution(int[][] arr,int[] arr2) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(int pos: arr2){
            for(int i=0; i<arr.length; i++){
                if(arr[i][pos-1] != 0){
                    int tmp = arr[i][pos-1];
                    arr[i][pos-1]=0;
                    if(!st.isEmpty() && tmp == st.peek()){
                        answer +=2;
                        st.pop();
                    }else{
                        st.push(tmp);
                    }
                    break;
                }
            }
        }

        


        return answer;
    }
}
