package ch08_member01;

public class C {
public void k() {
	B b = new B();
	b.n=7;
	b.g();
}
public void k1() {
	//동일 패키지내라도
	//클래스는 public이므로 접근 가능
	B2 b2 = new B2();
	//필드와 메소드는 private이므로
	//동일 패키지내에서도 접근 불가
	//b2.n = 10;
	//b2.g();
}
public void k3() {
	B3 b3 = new B3();
	b3.n=10;
	b3.g();
}
public void k4() {
	B4 b4 = new B4();
	b4.n=10;
	b4.g();
}
}
