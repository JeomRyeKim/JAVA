package ch03;
//멤버 - 필드,메소드,생성자
public class SomeClass {
	//필드
	int f1;//정수타입 값을 저장하는 변수 - 클래스범위에서 선언된 변수:field-초기화를 해야 읽을 수 있음.
			//클래스 범위에서 선언된 필드는 해당 타입의 기본값으로 (자동)초기화됨.
	//생성자
	SomeClass(){}
	
	//메소드
	void method() {
		int f1=0; //정수타입 값을 저장하는 변수 - 메소드 블럭 범위에서 선언된 변수:local변수
		System.out.print(f1);//local변수는 초기화를 해야 읽을 수 있음.
	}
	
	void method2() {//클래스범위에서 선언된 변수
		System.out.println(f1);//오류가 안 나는 이유? 기본값을 가지고 있어서 오류가 안남.
		
	}
	
}
