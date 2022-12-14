package ex3_2;

import java.util.Scanner;

public class EmployeeMenu {
	Scanner sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();
	
	public void employeeMenus() {
		int n= 0;
		while(n!=1 &&n!=2 &&n!=3&&n!=4&&n!=9) {
		System.out.println("1. 사원추가");
		System.out.println("2. 사원수정");
		System.out.println("3. 사원삭제");
		System.out.println("4. 사원출력");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호를 누르세요:");
		n=sc.nextInt();
		if(n!=1 &&n!=2 &&n!=3&&n!=4) {
			System.out.println("번호를 잘못 입력했습니다.");
			}else if(n==9){
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}else {
			}
		}
		if(n==1) insertEmp();
		if(n==2) updateEmp();
		if(n==3) deleteEmp();
		if(n==4) printEmp();
		
	}
	public void insertEmp() {
		System.out.print("사원 번호 :");
		int num = sc.nextInt();
		System.out.print("사원 이름 :");
		String name = sc.next();
		System.out.print("사원 성별 :");
		char gen = sc.next().charAt(0);
		System.out.print("전화 번호 :");
		String poneNum = sc.next();
		char a ='z';
		while(a!='y' || a!='n') {
		System.out.println("추가 정보를 더 입력하시겠습니까?(y/n)");
				 a =sc.next().charAt(0);
				 if(a!='y' && a!='n'){
					 System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
				 }else {
					 break;
				 }
		}
				 if(a=='n') {ec.add(num, name, gen, poneNum);
				 }
				 if(a=='y') {
					 System.out.print("사원 부서 :");
					 String dept = sc.next();
					 System.out.println("사원 연봉 :");
					 int sa = sc.nextInt();
					 System.out.println("보너스 율 :");
					 double bo = sc.nextDouble();
					 ec.add(num, name, gen, poneNum, dept, sa, bo);
				 }
				 employeeMenus();
		}
		
		
	
	
	public void updateEmp() {
		int n=0;
		while(n!=1 && n!=2 && n!=3 && n!=9) {
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1.전화번호");
		System.out.println("2.사원 연봉");
		System.out.println("3.보너스 율");
		System.out.println("9.돌아가기");
		System.out.println("메뉴 번호를 누르세요 :");
		n = sc.nextInt();
		if(n!=1 && n!=2 && n!=3 && n!=9) {
			System.out.println("잘못 입력하셨습니다.");
		}else if(n==9){
			System.out.println("메인메뉴로 돌아갑니다");
		}else {
		}
		if(n==1) {System.out.print("수정할 전화번호:");
				ec.modify(sc.next());
		}
		if(n==2) {System.out.print("수정할 사원 연봉:");
		ec.modify(sc.nextInt());
		}
		if(n==3){System.out.print("수정할 보너스 율:");
		ec.modify(sc.nextDouble());
		}
		
		}
		employeeMenus();
		}
	
	public void deleteEmp() {
		String s = "z";
		System.out.println("정말로 삭제하시겠습니까?(y/n)");
		s=sc.next();
		if(s.equals("y")) {
		ec.remove();
		System.out.println("삭제 완료");
		employeeMenus();
		}else if(s.equals("n")) {
			employeeMenus();
		}else {
			System.out.println("다시입력해주세요");
			deleteEmp();
		}
			
	}
	
	public void printEmp() {
		System.out.println(ec.inform());
		employeeMenus();
	}
	
	

}
