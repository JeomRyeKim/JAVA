package ch06_methods;

//Ŭ���� ��� �ʵ�, ������, �޼ҵ�
public class Car {
	//�޼ҵ�
	//����Ÿ�� �޼ҵ��(�Ű�����){����� ���� return�� �ݵ�� �־����.}
boolean isLefrGas() {
	int gas = 5;
	//���ǿ� ���� return���� ����Ǵ�
	//������ ��� �ڿ� return ó�� �Ŀ� 
	//������ false�� ��� ������ ���ɹ��� �� �� �ִ�.
	if(gas==0) {
		System.out.println("gas�� �����ϴ�.");
		return false;
	}
	System.out.println("gas�� �ֽ��ϴ�.");
	return true;
}
}