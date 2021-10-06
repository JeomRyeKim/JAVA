package ch08.b.copy;

import ch08.a.copy.A;

//default접근 지정자
class C {
void m() {
	//접근지정자가 default인 클래스는
	//다른 패키지에서 접근불가.
	//ch08.a.copy.A a = new ch08.a.copy.A();
	A a = new A();
}
}
