package ex2_14;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		for(int i=1; i<=n;i++){
		for(int j=1; j<=n-i+1;j++) {
			System.out.print("*");
		}
		for(int k=1; k<=i; k++) {
			System.out.print(" ");
		}
		System.out.println();
		}
	
	
	}

}
