package ch01_02;

@FunctionalInterface // �߻�޼ҵ尡 2���� ������ ����
public interface MyFunctionalInterface {
	public void method(int x);//�߻�޼ҵ�
	default void method2(int x) {}
//	public void method3(int x,int y);//�߻�޼ҵ�
}
