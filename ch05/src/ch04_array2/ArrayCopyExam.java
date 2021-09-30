package ch04_array2;

public class ArrayCopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];//[null][null][null][null][null]
		
		//for(int i=0; i<oldStrArray.length; i++)
		//	newStrArray[i] = oldStrArray[i];//["java"]["array"]["copy"][null][null]
		
		//System.arrayCopy() - 깊은 copy, 새로운 배열을 생성한 후에 사용
		//arraycopy(소스,소스의 시작index, 타겟, 타겟의 시작index, 복사할 길이)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);

		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i] + " ");
		
		System.out.println("\n------------------------");
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i] + " ");
		

		
		

	}

}
