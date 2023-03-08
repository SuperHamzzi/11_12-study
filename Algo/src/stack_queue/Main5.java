package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        int answer = 0;
        Stack<Character> st  = new Stack<>();
        for(int i=0; i<c.length; i++){
            if(c[i]=='(') {
                st.push(c[i]);
            }else if(c[i]==')'){
                if(c[i-1]=='('){

                    st.pop();
                        answer += st.size();
                }else{
                    answer++;
                    st.pop();
                }
            }
        }
        System.out.println(answer);
    }
}
