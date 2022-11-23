package ex2_5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 :");
		int n = sc.nextInt();
		int sum =0;
		for(int i= 1; i<=n; i++) {
			sum +=i;
			if(i==n) {
				System.out.println(i+" "+"="+sum);
			}else {
			System.out.print(i +" "+"+");
			}
		}
	}
}
