package ch01_If_02;

import java.util.Scanner;

public class dd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요(0~100):");
		int score = scanner.nextInt();
		//  점수 >=90 , 점수 <95 =>A- , 95==A0 ,  점수 >95 <=100 => A+
		String grade;
		if (score>=90) {//90~100
			grade = "A";
			if (score>95) grade += "+";//96~100
			else if (score==95) grade += "0";//95
			else grade += "-";//90~94
		}
		else if (score >=80) {
			grade = "B";//80~89
			if (score>85) grade += "+";//86~89
			else if (score==85) grade += "0";//85
			else grade += "-";//80~84
			
		}
		
		System.out.println("점수는 " + score + "이고, 등급은 " + grade + "입니다.");

	}

}
