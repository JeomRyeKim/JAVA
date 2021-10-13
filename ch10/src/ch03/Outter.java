package ch03;

public class Outter {
 A a = new A();//초기화
 void method() {
	 try {
		 //예외발생 메소드 호출한 곳에서 자체처리
		 a.method();
	} catch (Exception e) {
		System.out.println("A메소드에서 발생한 오류");
	}
 }
}
