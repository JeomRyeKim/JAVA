package ch02_String02;

public class StringBuliderEx01 {
	public static void main(String[] args) {
		//
		StringBuilder sb = new StringBuilder();
		//���ڿ� �̾���̱� append()
		sb.append("java ");
		sb.append("Programmaing study");
		//
		System.out.println(sb);//toString()�������
		
		//���� insert(index,���ڿ�)
		sb.insert(4, "2");
		System.out.println(sb);//toString()�������
		//setCharAt(index,�ٲܹ���)
		sb.setCharAt(4, '6');
		System.err.println(sb);//toString()�������
		
		//replace (����index,��index,�ٲܹ��ڿ�); ����index(����) <= ���� < ��index(������)
		sb.replace(6, 13, "Book");
		System.err.println(sb);//toString()�������
		
		//delete(����index,��index); ����index(����) <= ���� < ��index(������)
		sb.delete(4, 5);
		System.err.println(sb);//toString()�������
		
		int length = sb.length();
		System.out.println("�� ���ڼ�:" + length);
		
		//
		String result = sb.toString();//���۳��� ����
		System.out.println(result);

	}

}
