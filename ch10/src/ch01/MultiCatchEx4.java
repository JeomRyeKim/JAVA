package ch01;

public class MultiCatchEx4 {
	public static void main(String[] args) {
		String[] arr = {"hello","hi","bye"};
		String str = null;
		//
		try {
		System.out.println(arr[3]); //index ���� 
		int a = Integer.parseInt("��"); //������ ����
		System.out.println(str.toString());//null ����
		}catch (Exception e) {//try������ �߻��� ���ܸ� Exception��ü�� ��� ����ó��
			System.out.println("���� �߻�");
		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("�ε��� ����");
//		}catch (NumberFormatException e) {
//			System.out.println("������ ����");
//		}
	}

}
