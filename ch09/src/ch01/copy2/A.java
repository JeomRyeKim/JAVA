package ch01.copy2;

public class A {
//필드
	String field = "Qutter-field";
	void method() {
		System.out.println("Qutter-field");
	}
//인스턴스 멤버 클래스
 class B{
	//필드
	 String field = "Inner-field";
		void method1() {
			System.out.println("Inner-field");
		}
		void print() {
			System.out.println(this.field);//Inner
			this.method1();//Inner
			System.out.println(A.this.field);//Qutter
			A.this.method();//Qutter
		}
	 
 }
 
 
}
//class B{}