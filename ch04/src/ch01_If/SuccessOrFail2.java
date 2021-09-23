package ch01_If;

import java.util.Scanner;

public class SuccessOrFail2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner객체 생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 -정수로:");
		
		int score = scanner.nextInt();
		//조건이 참이면 블럭{}실행	
		/**
		if(score>=80) {
			System.out.println("축하합니다. 합격입니다.");
		}else {
			System.out.println("아쉽군요. 불합격입니다.");
		}
		*/
		if(score>=80) 
			System.out.println("축하합니다. 합격입니다.");
		else //score < 80
			System.out.println("아쉽군요. 불합격입니다.");
		
		//삼항연산식으로
		System.out.println((score>=80)?"축하합니다. 합격입니다." : "아쉽군요. 불합격입니다.");
		
		//자원해제
		scanner.close();
		
		
	}

}
