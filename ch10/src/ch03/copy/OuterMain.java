package ch03.copy;

public class OuterMain {
public static void main(String[] args) {
	Outter out = new Outter();
	//OutterŬ������ �ʵ� a�� �޼ҵ� ȣ��
	try { //���������� ȣ���� �̰����� ���������� ���� ó�����ִ°�
	out.method();
	}catch (Exception e) {}
	}
}