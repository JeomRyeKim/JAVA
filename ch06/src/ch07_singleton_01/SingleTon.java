package ch07_singleton_01;

/* �̱������� Ŭ���� ���� */
public class SingleTon {
//1.�ڽ�Ÿ���� static�ʵ� ���� = �ʱ�ȭ();
	private static SingleTon instance;//null
//2.�����ڸ� �ܺο��� ���� ���ϰ� private�� ó��
	private SingleTon(){}
//3.public �޼ҵ�� �����ϵ��� �޼ҵ� ����
	public static SingleTon getInstance() {
		if(instance==null) instance = new SingleTon(); //�ڿ� �������ؼ� �ӵ��� �� �� ����
		return instance;//null
	}
	
	
	
}
