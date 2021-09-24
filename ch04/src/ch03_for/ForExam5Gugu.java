package ch03_for;

import java.util.Scanner;

public class ForExam5Gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("보고 싶은 구구단은?");
		int num = scanner.nextInt();
		System.out.println("구구단 " + num + "단");
		for (int i=1; i<=9; i++) {
			System.out.print(num + " *" + i + "=" + i * num + "\t");
		}

	}

}
