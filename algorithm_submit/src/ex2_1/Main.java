package ex2_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요:");
		int n = sc.nextInt();
		if(n<1) System.out.println("1이상의 숫자를 입력해주세요");
		else {
			for(int i=1; i<=n; i++) {
				System.out.print(i+" ");
			}
		}
	}
}
