package ch02;

public class VariableConstanceExam {

	public static void main(String[] args) {
		int x = 10;
		int y;
		
		y = 20;
		x = 20;
		System.out.println(x + y);
		
		//상수 선언
		//final 타입 변수명 = 값;
		//상수는 일반적으로 대문자로 표시함 (변수와 구분)
		final double PI = 3.141592;
		//반지름 r = 5인 원의 넓이
		// PI*r*r
		//실수타입 변수를 선언하고 실수 변수PI의 값과 정수 5를 제곱한 결과값을 저장
		double area = PI*5*5; //3.141592 * 5.0 * 5.0
		
		//출력
		System.out.println(area);//실수값으로 출력
		
		//상수로 선언된 변수의 값은 초기화 후 변경시 오류발생함.
		//PI = 3.14;
		area = PI * 5 * 5;
		//출력
		System.out.println(area);
		
	}

}
