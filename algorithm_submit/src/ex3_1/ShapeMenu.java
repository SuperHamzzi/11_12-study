package ex3_1;

import java.util.Scanner;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	Shape sp = new Shape();
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		int n=0;
		while(n!=3 && n!=4 && n!=9) {
		System.out.println("====도형프로그램====");
		System.out.println("3.삼각형");
		System.out.println("4.사각형");
		System.out.println("9.프로그램 종료");
		System.out.print("메뉴 번호 :");
			n =sc.nextInt();
			if(n!=3 && n!=4 && n!=9) {
				System.out.println("잘못된번호입니다.");
			}
		}
		if(n==3) {sp.setType("삼각형");
			triangleMenu();
			}
		
		if(n==4) {sp.setType("사각형"); 
			squareMenu();
		}
		
		if(n==9) { System.out.println("프로그램 종료"); System.exit(0);
		}
	}
	
	public void triangleMenu() {
		int n=0;
			while(n!=2 &&n!=3&&n!=1&&n!=9) {
				System.out.println("===삼각형 ===");
				System.out.println("1.삼각형 면적");
				System.out.println("2.삼각형 색칠");
				System.out.println("3.삼각형 정보");
				System.out.println("9.메인으로");
				System.out.print("메뉴 번호:");
				n = sc.nextInt();
				if(n!=2&&n!=3&&n!=1&&n!=9) { 	System.out.println("다시입력해주세요");	}
				else {
					break;
				}
			}
		if(n==1) {
			System.out.print("높이:");
			sp.setHeight(sc.nextDouble());
			System.out.print("너비:");
			sp.setWidth(sc.nextDouble());
			System.out.println("삼각형의 면적 :"+ tc.calcArea(sp.getHeight(), sp.getWidth()));
			inputMenu();
		}
		if(n==2) {
			System.out.print("색깔을 입력하세요");
			sp.setColor(sc.next());
			inputMenu();
		}
		if(n==3) {
			System.out.println(sp.information());
			inputMenu();
		}
		if(n==9) {
			inputMenu();
		}
		}
	
		
	
	public void squareMenu() {
		int n=0;
		while(n!=2 &&n!=3&&n!=1&&n!=9) {
			System.out.println("====사각형 =====");
			System.out.println("1. 사각형 둘레 ");
			System.out.println("2. 사각형 면적 ");
			System.out.println("3. 사각형 색칠 ");
			System.out.println("4. 사각형 정보 ");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호:");
			n = sc.nextInt();
			if(n!=2&&n!=3&&n!=1&&n!=9 &&n!=4) { 	System.out.println("다시입력해주세요");	}
			else {
				break;
			}
		}
		if(n==1) {
			System.out.print("높이:");
			sp.setHeight(sc.nextDouble());
			System.out.print("너비:");
			sp.setWidth(sc.nextDouble());
			System.out.println(sp.getType()+"의 면적 :"+ scr.calcPerimeter(sp.getHeight(), sp.getWidth()));
			inputMenu();
		}
		if(n==2) {
			
		}
		if(n==3) {
			System.out.print("색깔을 입력하세요");
			scr.paintColor(sc.next());
			inputMenu();
		}
		if(n==4) {
			System.out.println(sp.information());
			inputMenu();
		}
		if(n==9) {
			inputMenu();
		}
		
	}
	public void inputSize(String type,int menuNum) {
	if(type=="삼각형"&& menuNum==1) {
	
	}
		
	}
	public void printlnformation(String type) {
		if(type=="삼각형") System.out.println(tc.print());
		if(type=="사각형") System.out.println(scr.print());
	}
	}
	


