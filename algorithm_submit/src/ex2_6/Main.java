package ex2_6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자:");
		int n = sc.nextInt();
		System.out.print("두 번째 숫자:");
		int m = sc.nextInt();
		if(n<1 || m<1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}else {
		for(int i= Math.min(n, m); i<=Math.max(m,n); i++) {
			System.out.print(i+" ");
		}
	}
	}
}
