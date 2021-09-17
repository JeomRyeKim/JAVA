package ch02;

public class TypeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 + 정수의 연산 결과는 정수의 결과값을 출력
		// => 범위가 좁은 타입과 범위가 넓은 타입의 연산결과는 범위가 넓은 타입으로 출력
		int x = 10; //정수
		double y = 15.2; //실수
		//출력
		System.out.println(x + y);//변수 x에 저장된 정수값과 변수 y에 저장된 실수값을 합한 결과를 출력
		// => 10 -> 10.0(정수 -> 실수:JVM내부적으로 자동처리됨), 10.0 + 15.2 = 25.2
		
		//정수 + 실수의 연산 결과는 실수의 결과값을 출력
		int x2 = 5; //정수
		double y2 = 2.7; //실수
		//출력
		System.out.println(x2 + y2);
		// => 5 -> 5.0(정수 -> 실수:JVM내부적으로 자동 처리됨), 5.0 + 2.7 = 7.7
	}

}
