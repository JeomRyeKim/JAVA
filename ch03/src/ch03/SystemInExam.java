package ch03;

/* ��ĳ�ʸ� Ǯ��� �̷��� ���� ��ġ�� ����� �� ��.*/

public class SystemInExam {

	//ǥ�� �Է½�Ʈ������ �� �Է½� I/O���� �߻� ���ɼ� ���� - ���� ó��
	public static void main(String[] args) throws Exception{//����ó�� ���� Throws Exception �߰�
		// TODO Auto-generated method stub
	//ǥ�� �Է½�Ʈ������ �� �Է� �ޱ�
		System.out.println("�Է�:");
		int a = System.in.read();//'A' -> ascii 65�� �ν�
		System.out.println("���: " + a);//Keyboard�� Ű�� �Է� �� EnterŰ�� ���� (EnterŰ = '\r''\n'
		System.in.read();
		System.in.read();
		
		//System.in.read()=48 or '0'; ==����
		System.out.println("�Է�:");
		int num = System.in.read() - 48; // ascii - 48  48-48=0
		// int num = System.in.read()- '0';
		System.out.println("���: " + num);
		System.in.read();//\r
		System.in.read();//\n
		
		// (char)System.in.read(); == ����
		System.out.println("�Է�: ");
		char char_ = (char) System.in.read();//'A' -> 65(int) -> char 'A'
		// int num = System.in.read()- '0';
		System.out.println("���: " + char_);

	}

}
