package ch02;

public class A {
	void method() {
		try {
			System.out.println("A�� �޼ҵ�");
		//���� ��ü ���� �����Ͽ� (���α׷�������)������ ��ɹ�
		throw new Exception();
		}catch (Exception e) {
			System.out.println("A ���ܹ߻�");
		}
	}
}
