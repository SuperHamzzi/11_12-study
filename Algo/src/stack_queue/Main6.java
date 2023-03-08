package stack_queue;

import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i =1; i<=n; i++){
            q.add(i);
        }
        int answer =0;
        while(q.size()!=1){
            answer++;
            if(answer != m){
                q.add(q.poll());
            }else{
                q.poll();
                answer=0;
            }
        }
        System.out.println(q.poll());
    }
}
