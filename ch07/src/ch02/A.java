package ch02;

public class A {
public static void main(String[] args) {
		B b = new B();
		b.method1();
	}
	//�ڽ� �޼ҵ� �����Ƿ� �θ� ��ü�� �޼ҵ尡 ������.
	public void method1() {
		System.out.println("�θ�޼ҵ�");
	}
}
class B extends A{
	//�θ�޼ҵ带 ����� ȿ��
	@Override//�޼ҵ� ������
	public void method1() {
		System.out.println("�ڽĸ޼ҵ�");

	}
	
}
