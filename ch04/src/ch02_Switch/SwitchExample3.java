package ch02_Switch;

import java.util.Scanner;

public class SwitchExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//월요일, 화요일, 수요일, 목요일, 금요일, 토요일, 일요일
	//월~목요일 : 열심히 공부합니다.
	//금요일 : 쇼핑을 합니다.
	//토요일,일요일 : 레저를 즐깁니다.
	Scanner scanner = new Scanner(System.in);
	System.out.println("요일을 입력해 주세요(ex:월요일):");
	String weekDay = scanner.next();
	

	switch(weekDay) {
	case "월요일": 
	case "화요일": 
	case "수요일": 
	case "목요일": System.out.println("열심히 공부합니다"); break;
	case "금요일": System.out.println("쇼핑을합니다"); break;
	case "토요일": 
	case "일요일": System.out.println("레저를 즐깁니다"); break;
	
	}
	//자원 해제
	scanner.close();
	}

}
