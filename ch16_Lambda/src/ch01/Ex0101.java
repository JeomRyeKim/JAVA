package ch01;

public class Ex0101 {
public static void main(String[] args) {
	//�������̽��� me()ȣ�� ��� "10+20=30"�̶�� ���� ��µǵ���
	//1. ����ü ���� ó��, 2.���ٽ� ��ȯ
	MyInter1 m1 = new MyInter1() {	
		@Override
		public void me() {
			System.out.println("10+20=30");
			
		}
	};
	m1.me();
	
	//���ٽ�
	m1 = () -> System.out.println("10+20=30");
	m1.me();
}
}
