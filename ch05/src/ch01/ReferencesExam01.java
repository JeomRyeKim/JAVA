package ch01;

public class ReferencesExam01 {
public static void main(String[] args) {
	//���ͷ��� ���ڿ� ���� - ���ͷ� Ư�� ����.
	String strA = "ȫ�浿";//100������ ȫ�浿�̶�� ��ü�� ���� str A,B�� 100���� ȫ�浿 ��ü�� ���� �����.
	String strB = "ȫ�浿";//String�� ����Ÿ�������� ���ͷ��� ����ؼ� ����� ���� �ּҰ��� �̿���.
	if(strA==strB) System.out.println("���� ���ڿ��� �����Ѵ�.");
	else System.out.println("�ٸ� ���ڿ��� �����Ѵ�.");
	
	//new String() - �����ڷ� ���ڿ� ���� - ����Ÿ�� Ư�� ����.
	//����Ÿ���� ������ new Ŭ������();���� ����
	String str1 = new String("ȫ�浿");//300���� ȫ�浿 ��ü ���� ���
	String str2 = new String("ȫ�浿");//400���� ȫ�浿 ��ü ���� ���
	if(str1==str2) System.out.println("���� ���ڿ��� �����Ѵ�.");
	else System.out.println("�ٸ� ���ڿ��� �����Ѵ�.");
	
	//
	//str1 = "������";//450���� ������ ��ü�� ���� ������� �ٲ�.
	//str1 = "ȫ�浿������";//500���� ȫ�浿������ ��ü�� ���� ������� �ٲ�

	}

}
