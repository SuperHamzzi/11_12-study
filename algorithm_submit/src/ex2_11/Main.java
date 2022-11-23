package ex2_11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 :");
		int n = sc.nextInt();
		System.out.print("공자 :");
		int m = sc.nextInt();
		for(int i=0; i<10; i++) {
			System.out.print(n+(m*i)+" ");
		}
	}

}
