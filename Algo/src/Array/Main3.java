package Array;

import java.util.Scanner;

public class Main3 {
         public  String solution(int n,int[] aArr,int[] bArr) {
                String answer = "";
                for(int i=0; i<n;i++){
                    if(aArr[i]==bArr[i]){
                        answer += "D";
                    } else if ((aArr[i]==1 &&bArr[i]==3)||(aArr[i]==2 &&bArr[i]==1)||(aArr[i]==3 &&bArr[i]==2)) {
                        answer +="A";
                    }else{
                        answer +="B";
                    }
                }
                return answer;
    }
    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr= new int[n];
        int[] bArr = new int[n];
        for(int i =0;i<n;i++){
            aArr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            bArr[i] = sc.nextInt();
        }
        for(char x: T.solution(n,aArr,bArr).toCharArray()) {
                System.out.println(x);
        }
    }


}
