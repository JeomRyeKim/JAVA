package ch03.copy;

public interface MyInterface {
	void method1(); //�߻�޼ҵ�
	//�������̽����� ��ü�� �ִ� �޼ҵ�,������ ������ ���ص� ��.
	default void method2() {} //�߻�޼ҵ�X
	default void method3() {} //�߻�޼ҵ�X
	default void method4() {} //�߻�޼ҵ�X
}
