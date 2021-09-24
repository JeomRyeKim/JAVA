package ch02_Switch;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int num = scanner.nextInt();
		switch(num) {
		case 1: System.out.println("L");break;
		case 2: System.out.println("O");break;
		case 3: System.out.println("V");break;
		case 4: System.out.println("E");break;
		default: System.out.println("뭐야");
		}

	}

}
