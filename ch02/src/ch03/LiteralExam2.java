package ch03;

public class LiteralExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* ���� ���ͷ� */
	// 10������ �ƴ� 8����,16����,2���� ���ͷ����� 10������ ��ȯ�Ǿ ������ ��
	int n = 15;//����Ÿ�� ������ �����ϰ� 10���� ���ͷ� 15�� ����
	int m = 015;//����Ÿ�� ������ �����ϰ� 8���� 015�� ����
	int k = 0x15;//����Ÿ�� ������ �����ϰ� 16���� 0x15�� ����
	int b = 0b0101;//����Ÿ�� ������ �����ϰ� 2���� 0b0101�� ����
	
	System.out.println(n); // 15 - 1*10^1 + 5*10^0
	System.out.println(m); // 1*8^1 + 5*8^0;
	System.out.println(k); // 1*16^1 + 5*16^0;
	System.out.println(b); // 0*2^3 + 1*2^2 + 0*2^1 + 1*2^0 = 0+4+0+1=5
	
	//2��� ���� - 16��Ʈ 32��Ʈ 64��Ʈ 
	//longŸ���� ������ ���ͷ� �ڿ� L�̳� l�� ����
	long l1 = 24l;//longŸ�� ���� ������ �����ϰ� longŸ�� ���ͷ��� ����
	
	// = �� ������ ó���ϴ� ���� ��������
	// = �� �������� ���� Ÿ�԰� ������ Ÿ���� ���ϸ� 
	//�������� = �� ������ ������ ���� ����Ÿ��(long) �������� ������ ���� ����Ÿ��(int)
	//����Ÿ�� 24�� 24L�� ��ȯ�ؼ� ����
	long l2 = 24;//longŸ�� ������ �����ϰ� int����Ÿ�� ���ͷ��� ����
	
	
	//�������� ���
	System.out.println(Integer.toBinaryString(n));
	
	
	}

}