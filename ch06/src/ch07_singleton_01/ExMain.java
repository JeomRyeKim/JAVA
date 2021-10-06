package ch07_singleton_01;

public class ExMain {
	public static void main(String[] args) {
		//multiton��� - new ������();
		//SingleTon s1 = new SingleTon(); - private���� ���� �Ұ�.
		//SingleTon s1 = SingleTon.instance; - private���� ���� �Ұ�.
		//Ŭ������.static�޼ҵ�ȣ��();
		SingleTon s1 = SingleTon.getInstance();// - public �޼ҵ� + getInstance�� ���� ����.
		SingleTon s2 = SingleTon.getInstance();
	
		System.out.println(s1==s2 ? "������ü" : "�ٸ���ü");
	
	}

}