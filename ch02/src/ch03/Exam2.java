package ch03;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 원주율 pi는 3.1415로 정의하고
		 * 원의 반지름이 2.5 인 원의 넓이를 구하는
		 * 공식은  area = pi * 2.5^2 이다. 이 식을 이용하여
		 * 원의 넓이 area를 실수로 출력하시오.
		 * 단, pi는 상수이다.	 *  */
		final double PI = 3.1415; //상수는 변하면 에러가 생겨서 final로 변하지 않게 만들어줌.
		double area = PI * 2.5 * 2.5;
		
		System.out.println(area);
		
		
	}

}
