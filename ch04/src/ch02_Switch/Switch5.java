package ch02_Switch;

import java.util.Scanner;

public class Switch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = "";
		System.out.println("월을 입력하세요");
		int num = scanner.nextInt();
		
		switch(num) {
		case 12: case 1: case 2: str = "겨울"; break;
		case 3: case 4: case 5: str = "봄"; break;
		case 6: case 7: case 8: 
			switch(num) {
			case 6: str = "초여름"; break;
			case 7: str = "진짜 더운 여름"; break;
			case 8: str = "끝 여름";
			}
			break;
		case 9: case 10: case 11: str = "가을"; break;
		default: str = "없는 계절!!!";
		}
		System.out.println("현재 계절은 " + str);
	}

}
 