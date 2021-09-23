package ch02;

import java.util.Scanner;

public class ArithmeticExam4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 69;
		
		System.out.println("두자리의 정수를 입력하세요:");
		input = scanner.nextInt();
		//2자리 정수를 키보드로 입력받아서 출력
		System.out.println("십의자리수:"+(input / 10));//몫
		System.out.println("1의자리수:"+(input % 10));//나머지
		
		

	}

}
