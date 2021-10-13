package ch03.copy;

public class A {
	//메소드() throws 예외객체{}
	//예외 떠넘기기
	void method() throws Exception {
			System.out.println("A의 메소드");
		//예외 객체 강제 생성하여 (프로그램쪽으로)던지는 명령문
		throw new Exception();//호출한 쪽으로 넘어감
		
	}
}
