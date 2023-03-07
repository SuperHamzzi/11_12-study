package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] ch  =n.toCharArray();
        Stack<Character> st = new Stack<>();
        String answer = "YES";
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='(') st.push(ch[i]);
            else{
                if(st.isEmpty()) {
                    answer = "NO";
                    break;
                }
                st.pop();
                }
        }
        if(!st.isEmpty()){
            answer ="NO";
        }
        System.out.println(answer);
    }
}
