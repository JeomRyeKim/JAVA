package ch02_01_R;

import ch02_01_Q.A;

public class B extends A {
	void method() {
		pub=1;//public
		pro=1;//protected - 부모클래스가 다른패키지지만 상속관계라 접근가능
		//def=1;//default - 부모클래스가 다른패키지라 접근불가.
		//pri=1;//private - 부모클래스가 다른클래스, 다른패키지라 접근불가
	}
}
