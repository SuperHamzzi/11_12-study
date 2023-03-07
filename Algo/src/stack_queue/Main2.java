package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String answer ="";
        Stack<Character> st = new Stack<>();
        for(char x: n.toCharArray()){
            if(x==')'){
                while(st.pop() !='(');
            }else{
                st.push(x);
            }
        }
        for(int i=0; i<st.size(); i++){
            answer += st.get(i);
        }
        System.out.println(answer);
    }
}
