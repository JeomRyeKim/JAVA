package ch02_final;

public class Parent {
 void method1() {}
 //final 메소드 - 자식클래스에서 재정의 불가.
 final void method2() {System.out.println("hello");}
}

class Child extends Parent{
	//재정의
	void method1() {System.out.println("재정의");}
	//재정의 불가(final때문)
	//void method2() {}
}