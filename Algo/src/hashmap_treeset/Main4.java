package hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 =sc.next();
        System.out.println(T.solution(str,str2));
    }

    private int solution(String str, String str2) {
        int answer = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        int dx = 0;
        char[] ch = str.toCharArray();
        for(char x : str2.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int i=0; i<str2.length()-1 ;i++){
            map2.put(ch[i],map2.getOrDefault(ch[i],0)+1);
        }
        int lt = 0;
        for(int rt=str2.length()-1; rt<str.length(); rt++){
            map2.put(ch[rt],map2.getOrDefault(ch[rt],0)+1);
            if(map.equals(map2)){
                answer++;
            }
            map2.put(ch[lt],map2.get(ch[lt])-1);
            if(map2.get(ch[lt])==0){
                map2.remove(ch[lt]);
            }
            lt++;
        }
        return answer;
    }
}
