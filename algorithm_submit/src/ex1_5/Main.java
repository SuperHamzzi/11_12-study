package ex1_5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String id ="hi";
		String pwd= "hihi2";
		System.out.println("아이디:");
		String idPush= sc.next();
		System.out.println("비밀번호:");
		String pwdPush= sc.next();
		if(id.equals(idPush) && pwd.equals(pwdPush)) System.out.println("로그인 성공");
		else if(id.equals(idPush) && !pwd.equals(pwdPush)) System.out.println("비밀번호 틀림");
		else if(!id.equals(idPush) && pwd.equals(pwdPush)) System.out.println("아이디 틀림");
		else System.out.println("둘다 틀림");
	}

}
