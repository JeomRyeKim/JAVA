package ch02_polymorphism;

public class AA {
	//필드의 다형성
	A a = new C();
	//매개변수의 다형성
	void m1(A a) {	
	}
public static void main(String[] args) {
	AA a = new AA();
	a.m1(new A());
	a.m1(new B());
	a.m1(new C());
	}
}
