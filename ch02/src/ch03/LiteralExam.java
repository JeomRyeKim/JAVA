package ch03;

/* 리터럴은 직접표현한 값 */
public class LiteralExam {
	public static void main(String[] args) {
		//변수에 직접 입력한 값;
		int x = 34;//리터럴 34
		double y = 42.195;//리터럴 42.195
		char c = '%';//리터럴 '%' - 문자타입 변수c를 선언하고 문자 '%'를 대입한 명령문
		boolean b = true;//리터럴 true - boolean타입 변수 b를 선언하고 boolean값 ture를 대입한 명령문
		String message = "helle";//리터럴 "hello" - 문자열타입 변수 message를 선언하고 문자열 "hello"를 대입한 명령문
		
		double result = x + y;//변수만 존재함(리터럴 없음)
		// - double타입 변수 result를 선언하고 변수의 값과 변수y의 값을 더한 결과를 대입한 명령문

		x = 20; //리터럴 - 직접입력한 값
		y = 3.14; //리터럴 - 직접입력한 값
	}

}
