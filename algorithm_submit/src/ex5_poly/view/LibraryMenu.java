package ex5_poly.view;

import java.util.ArrayList;
import java.util.Scanner;

import ex5_1_poly.model.vo.Book;
import ex5_poly.controller.LibraryController;
import ex5_poly.model.vo.Member;

public class LibraryMenu {
	String keyword;
	int select;
	String name;
	int age;
	char gen;
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		ArrayList<Member> member = new ArrayList<>();
		System.out.print("이름:");
		name =sc.next();
		System.out.print("나이:");
		age = sc.nextInt();
		System.out.print("성별:");
		gen = sc.next().charAt(0);
		member.add(name,age,gen);
		
		System.out.println("====메뉴 ====");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("9. 프로그램 종료하기");
		System.out.print("메뉴 번호 :");
		select=sc.nextInt();
		if(select ==1) {System.out.println(lc.myInfo());
		}else if(select ==2) { selectAll();}
		else if(select ==3) { searchBook();}
		else if(select ==4) {rentBook();}
		else if(select ==9) { System.out.println("시스템 종료"); System.exit(0);}
		else { System.out.println("잘못입력하셨습니다.처음부터 다시입력해주세요"); mainMenu();}
	}
	public void selectAll() {
		Book[] bList =lc.selectAll();
		for(int i=0; i<bList.length; i++) {
			System.out.println(i+"번도서:"+bList[i].getTitle()); 
		}
		
	}
	public void searchBook() {
		System.out.print("검색할 제목 키워드:");
		keyword = sc.next();
		lc.searchBook(keyword);
		
	}
	public void rentBook() {
		
	}
	

}
