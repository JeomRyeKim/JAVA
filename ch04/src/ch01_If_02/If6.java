package ch01_If_02;

import java.util.Scanner;

public class If6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	System.out.println("숫자를 입력하세요");
	int num = scanner.nextInt();
	String str = "";
	if(num < 10) str = "10미만";
	else if(num < 100) str = "10이상 100미만";	
	else if(num < 1000) {//100~1000
		if (num >= 500) str = "500이상 1000미만";//500~1000
		else str = "100이상 500미만";//100~500
	}			
	else str = "1000이상";
	
	System.out.println(str + "의 값입니다.");

	}

}
