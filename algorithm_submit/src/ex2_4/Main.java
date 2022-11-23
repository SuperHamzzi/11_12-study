package ex2_4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =0;
		while(1>n) {
			System.out.print("1이상의 숫자를 입력하세요:");
			n = sc.nextInt();
			if(n<1) {System.out.println("1 이상의 숫자를 입력해주세요");}else {
				break;
			}
		}
		for(int i=n; i>=1; i--) {
			System.out.print(i+" ");
		}
	}

}
