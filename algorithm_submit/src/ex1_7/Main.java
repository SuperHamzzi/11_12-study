package ex1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public void BMI(double he,double we) {
		double bmi;
		bmi=we/(he*he);
		if(bmi<18.5) { System.out.println("BMI 지수:"+bmi); System.out.println("정상체중");}
		else if(bmi>=23 &&25>bmi) { System.out.println("BMI 지수:"+bmi); System.out.println("과체중");}
		else if(bmi>=25 &&30>bmi) { System.out.println("BMI 지수:"+bmi); System.out.println("비만");}
		else if(bmi>=18.5 &&23>bmi) { System.out.println("BMI 지수:"+bmi); System.out.println("정상체중");}
		else {System.out.println("BMI 지수:" +bmi); System.out.println("고도 비만");}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		Main T = new Main();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("키입력해주세요:");
	Double height = Double.parseDouble(br.readLine());
	System.out.print("몸무게 입력해주세요:");
	Double weight = Double.parseDouble(br.readLine());
	T.BMI(height,weight);
	
	}
}
