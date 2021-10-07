package ch01;

public class A {
	int field1;
	void method1() {}
}

class B{}
//자바 클래스는 단일상속만 허용
//단일상속 - 부모가 하나인 클래스
//class C extends A,B{}
class C extends A{
	//부모클래스에서 상속받은 필드와 메소드는 보이지 않음.
	//int field1;
	//void method1() {}
	
	//자식클래스에서 추가한 필드와 메소드(상속의 대상-필드,메소드)
	String field2;
	void method2() {
		field2="hello";
		field1=10;//소스코드에서 보이지는 않지만 접근가능한 필드
		method1();//소스코드에서 보이지는 않지만 접근가능한 메소드
	}
}
//class C extends B{}