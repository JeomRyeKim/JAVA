package ch01_02;

public class Ex02 {
public static void main(String[] args) {
	MyFunctionalInterface fi = new MyFunctionalInterface() {
		@Override
		public void method(int x) {
			System.out.println(x);
		}
	};
	fi.method(10);
	
	//람다식
	fi = x -> System.out.println(x); //매개변수 1개 있으면 (x)괄호 생략 가능
	fi.method(20);	
}
}
