package ch02;

import java.util.Scanner;

public class TryWithResourceEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String msg = scanner.next();
		System.out.println(msg);
		int number = scanner.nextInt();
		System.out.println(number);
		//자원 해제
		scanner.close();

	}

}
