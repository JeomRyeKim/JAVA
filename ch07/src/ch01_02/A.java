package ch01_02;

public class A {
	public static void main(String[] args) {
		B b;
		b = new B();
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