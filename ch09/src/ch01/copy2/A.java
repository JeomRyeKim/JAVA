package ch01.copy2;

public class A {
//�ʵ�
	String field = "Qutter-field";
	void method() {
		System.out.println("Qutter-field");
	}
//�ν��Ͻ� ��� Ŭ����
 class B{
	//�ʵ�
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