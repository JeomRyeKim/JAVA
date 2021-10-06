package ch08.a.copy;

//default접근 지정자
class B {
void m() {
	//같은 패키지에서는 접근가능.
	A a = new A();
}
}
