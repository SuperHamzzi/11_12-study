package ex2_9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int n = sc.nextInt();
		if(n>9) {
			System.out.println("9이하의 숫자만 입력해주세요");
		}else {
		for(int i=n; i<=9; i++) {
			System.out.println("===="+i+"단====");
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+"="+i*j);
			}
		}
		}
		
	}

}
