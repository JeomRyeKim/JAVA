package ch07;

public interface InterB extends InterA {
	//�߻�޼ҵ�� ������
	void method2();
}
class B implements InterB{

	@Override
	public void method1() {
		
	}
	
	//�߻�޼ҵ�� ������ �Ǿ���.
	@Override
	public void method2() {
		
	}
	
}