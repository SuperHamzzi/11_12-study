package ex1_6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급:");
		String n = sc.next();
		if(n.equals("관리자")) System.out.println("회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회");
		else if(n.equals("회원")) System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		else if(n.equals("비회원"))System.out.println("게시글 조회");
		else System.out.println("잘못 입력");
	}
}
