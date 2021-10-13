package ch03.copy.copy;

public class Outter {
 A a = new A();//초기화
 void method() throws Exception {
		//예외발생 메소드 호출한 곳에서
	 	//이 메소드를 호출한 곳으로 떠넘기기
		 a.method();
 }
}
