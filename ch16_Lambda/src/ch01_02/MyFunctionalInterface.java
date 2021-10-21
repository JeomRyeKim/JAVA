package ch01_02;

@FunctionalInterface // 추상메소드가 2개라 오류가 생김
public interface MyFunctionalInterface {
	public void method(int x);//추상메소드
	default void method2(int x) {}
//	public void method3(int x,int y);//추상메소드
}
