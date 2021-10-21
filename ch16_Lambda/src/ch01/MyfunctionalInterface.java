package ch01;

//함수적 인터페이스 - 추상메소드가 1개인 인터페이스
@FunctionalInterface // 추상메소드가 2개라 오류생김
public interface MyfunctionalInterface {
	public void method();//추상 메소드
	default void defaultMethod() {}//디폴트 메소드
//	public void method2();
}
