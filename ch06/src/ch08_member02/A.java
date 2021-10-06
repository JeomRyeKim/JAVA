package ch08_member02;

import ch08_member01.B;
import ch08_member01.B2;
import ch08_member01.B3;
import ch08_member01.B4;
//다른 패키지의 클래스 멤버가 public이므로 멤버에 접근 가능.
public class A {
void f() {
	B b = new B();
	b.n=3;
	b.g();
}
void f1() {
	B2 b2 = new B2();
	//b2.n=10;
	//be.g();
}
void f2() {
	B3 b3 = new B3();
	//default접근지정 멤버는 다른 패키지의 클래스에서 접근불가.
	//필드
	//b3.n=10;
	//메소드
	//b3.g();
}
void f3() {
	B4 b4 = new B4();
		//protected선언 멤버는 다른패키지에서 접근 불가.
		//b4.n=10;
		//b4.g();
	
}
}
