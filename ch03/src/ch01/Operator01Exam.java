package ch01;

public class Operator01Exam {

	public static void main(String[] args) {
		/* 단항 연산자 , +, - 부호 연산기능*/
		int x = -100;// - 는 음수
		System.out.println(x);
		int result = +x;// 양수 +(-) => -
		System.out.println(result);
		int result2 = -x;// -(-) => +
		System.out.println(result2);

	}

}
