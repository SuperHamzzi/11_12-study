package ex2_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =0;
		while(1>n) {
			System.out.print("1이상의 숫자를 입력하세요:");
			n = sc.nextInt();
			}
		
		for(int i=n; i>=1; i--) {
			System.out.print(i+" ");
		}
	}

}
