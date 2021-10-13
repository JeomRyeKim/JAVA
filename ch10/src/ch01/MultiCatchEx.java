package ch01;

public class MultiCatchEx {
	public static void main(String[] args) {
		String[] arr = {"hello","hi","bye"};
		//발생하는 예외 객체별로 catch절 추가
		try {
		System.out.println(arr[3]); //index 오류 
		int a = Integer.parseInt("십"); //숫자형 오류
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외");
		}catch (NumberFormatException e) {
			System.out.println("숫자형 예외");
		}
	}

}
