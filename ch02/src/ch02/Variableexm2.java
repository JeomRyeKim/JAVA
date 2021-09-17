package ch02;

public class Variableexm2 {

	public static void main(String[] args) {
		//정수 타입 변수 선언
		// 타입 변수명 = 값;
		// 타입 변수명;
		//식별자(클래스명, 변수명, 메소드명)는 하나의 범위(블럭)내에서 유일해야함.
		int value;
		
		//정수 타입 변수 선언과 동시에 값 저장
		//오류 : 변수에 값이 저장되지 않으면 읽을 수 없음(초기화가 안된 변수는 사용불가)
		//int result = value + 10;
		
		//맞게 고친 후 코드
		//변수를 읽기 전에 먼저 초기화값을 저장해야한다
		//선언된 변수의 값 변경
		value = 30;
		int result = value + 10;

	}

}
