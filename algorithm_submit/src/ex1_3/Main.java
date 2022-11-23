package ex1_3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	int sum, avg;
	Scanner sc =new Scanner(System.in);
	System.out.println("국어 점수입력:");
	int lang = sc.nextInt();
	System.out.println("영어 점수입력:");
	int eng = sc.nextInt();
	System.out.println("수학 점수입력:");
	int math = sc.nextInt();
	sum= lang+eng+math;
	avg = sum/3;
	if(lang>=40 && eng>=40 && math>=40 && avg>=60) {
		System.out.println("축하합니다, 합격입니다!");
	}else {
		System.out.println("불합격입니다.");
	}
	
	}

}
