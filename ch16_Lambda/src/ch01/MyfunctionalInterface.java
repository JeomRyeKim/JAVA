package ch01;

//�Լ��� �������̽� - �߻�޼ҵ尡 1���� �������̽�
@FunctionalInterface // �߻�޼ҵ尡 2���� ��������
public interface MyfunctionalInterface {
	public void method();//�߻� �޼ҵ�
	default void defaultMethod() {}//����Ʈ �޼ҵ�
//	public void method2();
}
