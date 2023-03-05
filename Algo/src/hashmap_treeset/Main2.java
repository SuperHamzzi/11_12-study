package hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc =new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.solution(a,b));

    }

    private String solution(String a, String b) {
        String answer = "YES";
        HashMap<Character,Integer> map1 = new HashMap<>();

        for(char x: a.toCharArray()){
            map1.put(x,map1.getOrDefault(x,0)+1);
        }
        for(char x: b.toCharArray()){
            if(!map1.containsKey(x) || map1.get(x)==0){return "NO";
            }
            map1.put(x, map1.get(x)-1);
        }
        return answer;
    }
}
