package ch02;

import java.util.Scanner;

public class TryWithResourceEx2 {
	public static void main(String[] args) {
		Scanner scanner=null;
		try{
		scanner = new Scanner(System.in);
		String msg = scanner.next();
		System.out.println(msg);
		int number = scanner.nextInt();
		System.out.println(number);
		
		}catch (Exception e) {
			System.out.println("예외발생");
		}finally {
			System.out.println("자원해제");
			//자원 해제
			scanner.close();
		}

	}

}
