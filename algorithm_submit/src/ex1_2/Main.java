package ex1_2;

import java.util.Scanner;

public class Main {
	public void solution(int n) {
		if(0>=n) {
			System.out.println("양수만 입력해주세요.");
		}else if(n%2==1){
			System.out.println("홀수다");
		}else {
			System.out.println("짝수다");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main T =new Main();
		System.out.print("숫자를 한 개 입력하세요:");
		int n =sc.nextInt();
		T.solution(n);
	}
}
