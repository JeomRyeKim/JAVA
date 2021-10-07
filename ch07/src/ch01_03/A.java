package ch01_03;

//부모클래스의 default생성자만 호출
public class A {
	public static void main(String[] args) {
		B b;
		b = new B(5);
	}
	//default생성자
	public A() { System.out.println("생성자A"); }
	//일반 생성자
	public A(int X) {System.out.println("생성자" + X);}
}
class B extends A{
	//default생성자
	public B() { System.out.println("생성자B"); }	
	//매개변수생성자도 부모클래스의 default생성자만 호출.
	public B(int x) { System.out.println("매개변수생성자"); }
}