package ch02;

public class VariableConstanceExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수의 선언과 동시에 값 초기화
		//타입 변수명 = 값;
		int x = 10;
		
		//변수의 선언
		//타입 변수명;
		int y;
		//선언된 변수의 값 초기화
		//변수명 = 값;
		y = 20;
		
		//변수 x에 저장된 초기값을 정수 20으로 변경하여 저장
		x = 20;
		
		System.out.println(x + y);

	}

}
