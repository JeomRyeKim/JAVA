package ch01;

public class MultiCatchEx4 {
	public static void main(String[] args) {
		String[] arr = {"hello","hi","bye"};
		String str = null;
		//
		try {
		System.out.println(arr[3]); //index 오류 
		int a = Integer.parseInt("십"); //숫자형 오류
		System.out.println(str.toString());//null 예외
		}catch (Exception e) {//try절에서 발생한 예외를 Exception객체가 모두 수용처리
			System.out.println("예외 발생");
		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 예외");
//		}catch (NumberFormatException e) {
//			System.out.println("숫자형 예외");
//		}
	}

}
