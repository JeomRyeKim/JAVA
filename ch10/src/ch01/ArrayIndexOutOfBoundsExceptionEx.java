package ch01;

public class ArrayIndexOutOfBoundsExceptionEx {
	public static void main(String[] args) {
		//배열 접근 오류 인덱스 범위를 벗어날 때 발생하는 예외
		String[] arr = {"hello","hi","bye"};
		try {
		System.out.println(arr[0]);
		System.out.println(arr[3]);
		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();//디버깅
			System.out.println("index 범위를 벗어난 접근");
		}
	}

}
