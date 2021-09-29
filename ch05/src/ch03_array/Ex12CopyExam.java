package ch03_array;

/*���� ����� ���� ���� */
public class Ex12CopyExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.���� ���� - �迭��ü 1�� ����(�������� �����ؼ� ���) -> �ؽ��ڵ尡 ����.
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1;//�����ϴ� ������ �ּҰ��� �Ѱܼ� ����
		for(int i=0; i<arr1.length; i++) System.out.print(arr1[i]);
		System.out.println();
		for(int i=0; i<arr2.length; i++) System.out.print(arr2[i]);
		System.out.println();
		System.out.println("-----------------");
		System.out.println("arr1�� hash�ڵ尪:" + arr1.hashCode());//��ü�� ����� �ּҰ��� �ؽù��������� ����� ��.
		System.out.println("arr2�� hash�ڵ尪:" + arr2.hashCode());
		
		System.out.println("arr1�� hash�ڵ尪:" + System.identityHashCode(arr1));
		System.out.println("arr2�� hash�ڵ尪:" + System.identityHashCode(arr2));
		
		//2.���� ���� - �迭��ü 2�� ���� -> �ؽ��ڵ尡 �ٸ�.
		int[] arr3 = {1,2,3,4,5};
		int[] arr4 = new int[5];//���ο� �迭 ��ü ���� -> [0][0][0][0][0]
		for(int i=0; i<arr3.length; i++)//��ҵ��� �ѱ�
			arr4[i] = arr3[i];
		for(int i=0; i<arr3.length; i++) System.out.print(arr3[i]);
		System.out.println();
		for(int i=0; i<arr4.length; i++) System.out.print(arr4[i]);
		System.out.println();
		System.out.println("arr3�� hash�ڵ尪:" + arr3.hashCode());
		System.out.println("arr4�� hash�ڵ尪:" + arr4.hashCode());
		//hasgCode() :�޼ҵ�, ��ü�� �ּҰ��� ��ȯ�Ͽ� ������ ��ü�� ������ ������
		//-> ���� �迭�� �����ϴ��� �ٸ� �迭�� �����ϴ��� Ȯ�� ����.
		//��ȯ �� �� �ؽ��ڵ� ������(������ ������ �������� 0�̸� 0�� ������, �������� 1�̸� 1�������� ������ ������.)�� �����
		System.out.println("arr3�� hash�ڵ尪:" + System.identityHashCode(arr3));
		System.out.println("arr4�� hash�ڵ尪:" + System.identityHashCode(arr4));
	}

}
