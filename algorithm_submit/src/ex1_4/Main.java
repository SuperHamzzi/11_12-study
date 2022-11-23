package ex1_4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("1~12 사이의 정수 입력:");
		int n = sc.nextInt();
		switch(n) {
		
		case 1,2,3 -> System.out.println(n+"월은 봄입니다."); 
		case 4,5,6 -> System.out.println(n+"월은 여름입니다.");
		case 7,8,9 -> System.out.println(n+"월은 가을입니다.");
		case 10,11,12 -> System.out.println(n+"월은 겨울입니다.");
		default-> System.out.println(n+"월은 잘못 입력된 달입니다.");
		
		}
		
		
	
	
	}


}
