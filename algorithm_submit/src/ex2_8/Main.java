package ex2_8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자:");
		int n =sc.nextInt();
		System.out.println("---"+n+"단---");
		for(int i=1; i<=9; i++) {
		System.out.println(n+" * "+i+" = "+ (n*i));
		}
	}

}
