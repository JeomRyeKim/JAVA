package ch07;

public interface InterB extends InterA {
	//추상메소드로 재정의
	void method2();
}
class B implements InterB{

	@Override
	public void method1() {
		
	}
	
	//추상메소드로 재정의 되었음.
	@Override
	public void method2() {
		
	}
	
}