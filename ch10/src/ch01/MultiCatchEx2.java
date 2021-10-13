package ch01;

public class MultiCatchEx2 {
	public static void main(String[] args) {
		String[] arr = {"hello","hi","bye"};
		//발생하는 예외 객체들이 동일 레벨인 경우 |로 나열하여 사용가능
		try {
		System.out.println(arr[3]); //index 오류 
		int a = Integer.parseInt("십"); //숫자형 오류
		}catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("인덱스나 숫자형 예외");
		}
	}

}
