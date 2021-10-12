package ch03.copy;

public interface MyInterface {
	void method1(); //추상메소드
	//인터페이스내에 실체가 있는 메소드,구현시 재정의 안해도 됨.
	default void method2() {} //추상메소드X
	default void method3() {} //추상메소드X
	default void method4() {} //추상메소드X
}
