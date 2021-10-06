package ch07.a;
//ch07.a.A
//import ch07.b.D;
//import ch07.b.F;
import ch07.b.*;//* - 와일드카드문자 사용 패키지내 전체를 import가능.

public class A {
void method() {
	D d = new D();
	F f = new F();
}
}
