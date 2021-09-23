package ch01_If;

import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner객체 생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 -정수로:");
		int score = scanner.nextInt();
		//조건이 참이면 블럭{}실행
		//if(score>=80) {
		//	System.out.println("축하합니다. 합격입니다.");
		//}
		//dangling상태
		if(score>=80) {
			System.out.println("축하합니다. 합격입니다.");
		}
		
		//자원해제
		scanner.close();
		
		
	}

}
