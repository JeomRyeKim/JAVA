package ch01;

public class ReferenceNullExam {
public static void main(String[] args) {
	String str1 = new String("ȫ�浿");//100���� ȫ�浿 ��ü �������
	System.out.println(str1);
	//���
	str1 = null;//100���� ȫ�浿 ��ü�� ���ÿ� ���� ���� null�� �������, null�̶�� ��ü�� ���� ����°� �ƴ�.
	System.out.println(str1);//null
	}

}
