package ch01;

public class ClassCastExceptionEx {
	public static void main(String[] args) {
		try {
		Animal animal = new Cat();
		Cat cat = null;
		System.out.println(cat.toString());
		//���� ó�� �� �� ���� �߻����� ���� ���ܵ� �߻�X - �ٷ� ���α׷� ����
		Dog dog = (Dog)animal;//���� �߻� - ���α׷��� ���ᰡ ��.
		//���� �߻��� �Ʒ� ��ɹ� ���� �� ��
		System.out.println("����ȯ ó��");
		}catch (ClassCastException e) {
			System.out.println("����̴� ���� �� �� �����ϴ�.");
		}finally { // �̰� ������ �����ϰ� �Ѿ�� �Ѵ�.(�׻� �����)
			//��ɹ� ����
			System.out.println("���α׷� ����");
		}

	}

}
