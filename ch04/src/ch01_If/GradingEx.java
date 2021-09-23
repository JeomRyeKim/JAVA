package ch01_If;

import java.util.Scanner;

public class GradingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();//점수 읽기
		
		if(score>=90) grade = 'A';//90이상
		else if(score>=80) grade = 'B';//90미만 중에서 80이상
		else if(score>=70) grade = 'C';//80미만 중에서 70이상
		else if(score>=60) grade = 'D';//70미만 중에서 60이상
		else grade = 'F';//나머지d(default) 60미만 모두
		
		System.out.println("학점은 " + grade + "입니다.");
		
		//자원해체
		scanner.close();

	}

}
