package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sr = sc.next();
        Stack<Integer> st = new Stack<>();
        int answer = 0;
        for (char x : sr.toCharArray()) {
            if (Character.isDigit(x)) {
                st.push(x - 48);
            } else {
                int rt = st.pop();
                int lt = st.pop();
                if (x == '+') {
                    st.push(lt + rt);
                } else if (x == '-') {
                    st.push(lt - rt);
                } else if (x == '*') {
                    st.push(lt * rt);
                } else if (x == '/') {
                    st.push(lt / rt);
                }
            }
        }

        System.out.println(st.get(0));

    }
}
