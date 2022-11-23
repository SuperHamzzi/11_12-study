package ex1_1;

import java.util.Scanner;


public class Main {
	public String solution(int a) {
		if(a==1)  return "입력메뉴입니다.";
		else if(a==2) return "수정메뉴입니다.";
		else if(a==3) return "조회메뉴입니다.";
		else if(a==4) return "삭제메뉴입니다.";
		else if(a==7) return "종료입니다";
		else return "잘못된값을 입력했습니다";
	
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
	
	System.out.println("1. 입력");
	System.out.println("2. 수정");
	System.out.println("3. 조회");
	System.out.println("4. 삭제");
	System.out.println("7. 종료");
	System.out.print("메뉴 번호를 입력하세요 :");
	
	int n = sc.nextInt();
	
	System.out.println(T.solution(n));
	}
}
