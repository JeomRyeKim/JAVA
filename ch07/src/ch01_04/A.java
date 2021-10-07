package ch01_04;

//부모클래스의 생성자를 선택하여 호출 super();
public class A {
	public static void main(String[] args) {
		B b;
		b = new B(5);
	}
	//default생성자
	public A() { System.out.println("생성자A"); }
	//일반 생성자
	public A(int X) {System.out.println("생성자" + X);}//호출됨.
}
class B extends A{
	//default생성자
	public B() { System.out.println("생성자B"); }	
	//super()메소드로 부모클래스의 매개변수있는 생성자 호출 가능.
	public B(int x) {
		super(x);
		System.out.println("매개변수생성자"); }
}