package ex1_9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("중간 점수:");
		int mid = sc.nextInt();
		System.out.print("기말 점수:");
		int last = sc.nextInt();
		System.out.print("과제 점수:");
		int prac = sc.nextInt();
		System.out.print("출석 횟수:");
		int atd  = sc.nextInt();
		double mid2 = mid*0.2;
		double last2 = last*0.3;
		double prac2 = prac*0.3;
		double atd2 = atd;
		double total = mid2+last2+prac2+atd2;
		String pass;
		if(total>70) {
			pass = "Pass[합격]";
		}else{
			pass = "Fail[점수 미달]";
		}
		
		System.out.println("=========결과==========");
		System.out.println("중간 점수(20):"+mid2);
		System.out.println("기말 점수(30):"+last2);
		System.out.println("과제 점수(30):"+prac2);
		System.out.println("출석 점수(20):"+atd2);
		System.out.println("총점:"+total);
		System.out.println(pass);
		
		
	}

}
