package ch04_array2;

public class ArrayCopyExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];//[null][null][null][null][null]
		
		//for(int i=0; i<oldStrArray.length; i++)
		//	newStrArray[i] = oldStrArray[i];//["java"]["array"]["copy"][null][null]
		
		//System.arrayCopy()
		//arraycopy(�ҽ�,�ҽ��� ����index, Ÿ��, Ÿ���� ����index, ������ ����)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);

		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i] + " ");
		
		System.out.println("\n------------------------");
		//java.lang.ArrayIndexOutOfBoundsExceptuin : �ҽ��� ������ 2���ε� ������ ���̸� 3���� �ϸ� �����߻�
		System.arraycopy(oldStrArray, 1, newStrArray, 0, oldStrArray.length-1);
		//�ε���1���� ������ �� �ִµ� oldStrArray.length-1�� �� ���ָ� ������ ���� 3����� �ǹ��ε�
		//3�������� ������ ������ ��.
		
		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i] + " ");
		

		
		

	}

}
