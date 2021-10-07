package ch01_01;

public class A {
	public static void main(String[] args) {
		B b;
		b = new B();
	}
	//default持失切
	public A() {
		System.out.println("持失切A");
	}
	//析鋼 持失切
	public A(int X) {
		System.out.println("持失切" + X);
	}
}
class B extends A{
	//default持失切
	public B() {
		System.out.println("持失切B");
	}
}