package ch01.copy2;

public class OutterMain {
public static void main(String[] args) {
	//인스턴스 객체 생성
	A a = new A();
	A.B b = a.new B();
	b.print();
}
}
