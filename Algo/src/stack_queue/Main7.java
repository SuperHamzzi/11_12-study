package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        Queue<Character> q = new LinkedList<>();
        String answer ="YES";
        String b = sc.next();
        for(int i =0; i<a.length; i++){
            q.offer(a[i]);
        }
        for(char x: b.toCharArray()) {
            if(q.isEmpty()){
                break;
            }
            if (q.peek() == x) {
                q.poll();
            }
        }
        if(!q.isEmpty()){
            answer="NO";
        }
        System.out.println(answer);
    }
}
