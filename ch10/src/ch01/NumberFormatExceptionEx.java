package ch01;

public class NumberFormatExceptionEx {
	public static void main(String[] args) {
		try {
		int a = Integer.parseInt("10");//"10" -> 10
		System.out.println(a);
		//예외발생
		a = Integer.parseInt("십");//"10" -> 10
		System.out.println(a);
		}catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		}

	}

}
