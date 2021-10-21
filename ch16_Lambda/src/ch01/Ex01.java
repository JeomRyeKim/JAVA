package ch01;

public class Ex01 {
public static void main(String[] args) {
	MyfunctionalInterface fi = new MyfunctionalInterface() {
		@Override
		public void method() {
			System.out.println("hello");
		}
	};
	
	fi.method();
	//이 프로그램 네에서 재정의하여 사용
	//람다식 변환
	fi = () -> System.out.println("hello");
	//fi.method()호출하면 jvm이 자동으로 인터페이스의 메소드 호출
	fi.method();
}
}
