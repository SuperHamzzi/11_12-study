package ex1_8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("피연산자1 입력:");
		int n = sc.nextInt();
		System.out.println("피연산자2 입력:");
		int m = sc.nextInt();
		System.out.println("연산자를 입력(+,-,*,/,%) :");
		String k = sc.next();
		if(n>0 && m>0 && (k.equals("+") || k.equals("-") || k.equals("/") || k.equals("*")||k.equals("%"))){
			if(k.equals("+")) {System.out.println(n +"-"+m+"="+(n+m));}
			else if(k.equals("-")) {System.out.println(n +"-"+m+"="+(n-m));}
			else if(k.equals("*")) {System.out.println(n +"*"+m+"="+(n*m));}
			else if(k.equals("/")) {System.out.println(n +"/"+m+"="+(n/(double)m));}
			else {System.out.println(n +"*"+m+"="+(n*m));}
		}else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}

}
