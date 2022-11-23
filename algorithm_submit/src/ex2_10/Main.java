package ex2_10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=10;
		while(n>9) {
			System.out.print("숫자 : ");
			n = sc.nextInt();
			if(n<=9) {
				break;
			}
			System.out.println("9이하의 숫자만 입력해주세요");
		}
		
		for(int i=n; i<=9; i++) {
			System.out.println("===="+i+"단====");
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+"="+i*j);
			
		}
		}
		
	}

}
