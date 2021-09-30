package ch04_array2;

public class ArrayCopyExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];//[null][null][null][null][null]
		
		//for(int i=0; i<oldStrArray.length; i++)
		//	newStrArray[i] = oldStrArray[i];//["java"]["array"]["copy"][null][null]
		
		//System.arrayCopy()
		//arraycopy(소스,소스의 시작index, 타겟, 타겟의 시작index, 복사할 길이)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);

		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i] + " ");
		
		System.out.println("\n------------------------");
		//java.lang.ArrayIndexOutOfBoundsExceptuin : 소스의 개수가 2개인데 복사할 길이를 3으로 하면 오류발생
		System.arraycopy(oldStrArray, 1, newStrArray, 0, oldStrArray.length-1);
		//인덱스1부터 복사할 수 있는데 oldStrArray.length-1을 안 해주면 복사할 것이 3개라는 의미인데
		//3개까지는 없으니 오류가 남.
		
		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i] + " ");
		

		
		

	}

}
