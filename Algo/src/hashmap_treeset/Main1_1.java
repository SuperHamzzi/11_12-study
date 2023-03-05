package hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

public class Main1_1 {
    public static void main(String[] args) {
        Main1_1 T = new Main1_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n,str));
    }

    private char solution(int n, String s) {
        char answer=' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        System.out.println(map.containsKey('A'));
        System.out.println(map.size());
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
//            System.out.println(x+" "+map.get(x));
            if(map.get(key)>max){
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

}
