package hashmap_treeset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Main3 T=  new Main3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x: T.solution(n,m,arr)) {
            System.out.print(x+" ");
        }


    }

    public ArrayList<Integer> solution(int n, int m, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<m-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int dx = 0;
        for(int i=m-1; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            answer.add(map.size());
            map.put(arr[dx], map.get(arr[dx])-1);
            if(map.get(arr[dx])==0){
                map.remove(arr[dx]);
            }
            dx++;
        }
        return answer;
    }
}
