package ex4;

import java.util.Scanner;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public MemberMenu(){
	}
		
	public void mainMenu(){
		int n = 0;

		while(n!=1 &&n!=2 &&n!=3 && n!=4 &&n!=5 && n!=9) {
			System.out.println("최대 등록 가능한 회원 수는 10명입니다.");
			System.out.println("현재 등록된 회원 수는 "+mc.existMemberNum()+"명입니다.");
			
			if (mc.existMemberNum() != 10)
				System.out.println("1. 새 회원 등록");
			else
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			n = sc.nextInt();
			if((mc.existMemberNum() != 10 && (n!=1 &&n!=2 &&n!=3 && n!=4 &&n!=5 && n!=9)) || (mc.existMemberNum() == 10 && (n!=2 &&n!=3 && n!=4 &&n!=5 && n!=9))) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		if(n==1 && mc.existMemberNum() != 10) insertMember();
		if(n==2) searchMember();
		if(n==3) updateMember();
		if(n==4) deleteMember();
		if(n==5) printAll();
		if(n==9) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
	}
	
	public void insertMember(){
		String n, h, k, j, u;
		int z;

		System.out.println("새 회원을 등록합니다.");
		System.out.print("아이디: ");
		n = sc.next();
		while ((mc.checkId(n))==false) { 
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			System.out.print("아이디: ");
			n = sc.next();
		}
		System.out.print("이름: ");
		h = sc.next();
		System.out.print("비밀번호: ");
		k = sc.next();
		System.out.print("이메일: ");
		j = sc.next();
		System.out.print("성별(M/F): ");
		u = sc.next();
		while (!u.equals("m")&&!u.equals("M")&&!u.equals("f")&&!u.equals("F")){
			System.out.println("성별을 다시 입력하세요.");
			System.out.print("성별(M/F): ");
			u = sc.next();
		}
		System.out.print("나이: ");
		z = sc.nextInt();				
			
		mc.insertMember(n, h, z, j, u, k);
		System.out.println();
		mainMenu();
	}
	public void searchMember(){
		int n;

		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호: ");
		n = sc.nextInt();
		if(n!=1 &&n!=2 &&n!=3 &&n!=9) {
			System.out.println("잘못 입력하셨습니다.");
			mainMenu();
		}
		if(n==1) searchId();
		if(n==2) searchName();
		if(n==3) searchEmail();
		if(n==9) {
			System.out.println("메인으로 돌아갑니다.");
			System.out.println();
			mainMenu();
		}
	}
	public void searchId(){
		String id;
		String inform;
		
		System.out.print("검색할 아이디: ");
		id = sc.next();
		inform = mc.searchId(id);
		if (inform == null)
			System.out.println("검색 결과가 없습니다.");				
		else {
			System.out.println("찾으신 회원 검색 결과입니다.");
			System.out.println(inform);
		}
		System.out.println();
		mainMenu();
	}
	public void searchName(){
		String name;
		Member[] m;
		int i = 0;
		
		System.out.print("검색할 이름: ");
		name = sc.next();
		m = mc.searchName(name);
		if (m[0] == null)
			System.out.println("검색 결과가 없습니다.");				
		else {
			System.out.println("찾으신 회원 검색 결과입니다.");
			while (m[i]!=null) {
				System.out.println(m[i].inform());					
				i++;
			}
		}
		System.out.println();
		mainMenu();
	}
	public void searchEmail(){
		String email;
		Member[] m;
		int i = 0;
		
		System.out.print("검색할 이메일: ");
		email = sc.next();
		m = mc.searchEmail(email);
		if (m[0] == null)
			System.out.println("검색 결과가 없습니다.");				
		else {
			System.out.println("찾으신 회원 검색 결과입니다.");
			while (m[i]!=null) {
				System.out.println(m[i].inform());					
				i++;
			}
		}
		System.out.println();
		mainMenu();
	}
	public void updateMember() {
		int n;

		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호: ");
		n = sc.nextInt();
		if(n!=1 &&n!=2 &&n!=3 &&n!=9) {
			System.out.println("잘못 입력하셨습니다.");
			mainMenu();
		}
		if(n==1) updatePassword();
		if(n==2) updateName();
		if(n==3) updateEmail();
		if(n==9) {
			System.out.println("메인으로 돌아갑니다.");
			System.out.println();
			mainMenu();
		}
	}
	public void updatePassword() {
		String id, password;
		
		System.out.print("수정할 회원의 아이디: ");
		id = sc.next();
		System.out.print("수정할 비밀번호: ");
		password = sc.next();
		
		if (mc.updatePassword(id, password))
			System.out.println("수정이 성공적으로 되었습니다.");
		else
			System.out.println("존재하지 않는 아이디입니다.");
		System.out.println();
		mainMenu();
	}
	public void updateName() {
		String id, name;
		
		System.out.print("수정할 회원의 아이디: ");
		id = sc.next();
		System.out.print("수정할 이름: ");
		name = sc.next();
		
		if (mc.updateName(id, name))
			System.out.println("수정이 성공적으로 되었습니다.");
		else
			System.out.println("존재하지 않는 아이디입니다.");
		System.out.println();
		mainMenu();
		
	}
	public void updateEmail() {			
		String id, email;
		
		System.out.print("수정할 회원의 아이디: ");
		id = sc.next();
		System.out.print("수정할 이메일: ");
		email = sc.next();
		
		if (mc.updateEmail(id, email))
			System.out.println("수정이 성공적으로 되었습니다.");
		else
			System.out.println("존재하지 않는 아이디입니다.");
		System.out.println();
		mainMenu();
	}
	public void deleteMember(){
		int n;

		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호: ");
		n = sc.nextInt();
		if(n!=1 &&n!=2 &&n!=9) {
			System.out.println("잘못 입력하셨습니다.");
			mainMenu();
		}
		if(n==1) deleteOne();
		if(n==2) deleteAll();
		if(n==9) {
			System.out.println("메인으로 돌아갑니다.");
			System.out.println();
			mainMenu();
		}
		
	}
	public void deleteOne(){
		String id;
		String answer;
					
		System.out.print("삭제할 회원의 아이디: ");
		id = sc.next();
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		answer = sc.next();
		if (answer.equals("Y") || answer.equals("y")) {
			if (mc.delete(id))
				System.out.println("성공적으로 삭제하였습니다.");				
			else
				System.out.println("존재하지 않는 아이디입니다.");				
		}
		System.out.println();
		mainMenu();
	}
	public void deleteAll(){
		String answer;
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		answer = sc.next();
		if (answer.equals("Y") || answer.equals("y")) {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");				
		}
		System.out.println();
		mainMenu();
	}
	public void printAll(){
		if (mc.existMemberNum() != 0) {
			for (int i = 0; i < mc.existMemberNum(); i++)
				System.out.println(mc.printAll()[i].inform());
		}
		else {
			System.out.println("저장된 회원이 없습니다.");				
		}
		System.out.println();
		mainMenu();
	}


}
