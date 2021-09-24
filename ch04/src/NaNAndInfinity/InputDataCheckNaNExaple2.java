package NaNAndInfinity;

import java.util.Scanner;

public class InputDataCheckNaNExaple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자가 아닌 NaN을 입력받아서 연산 처리
		String userInput;
		Scanner scanner = new Scanner(System.in);
		System.out.println("실수를 입력하세요");
		userInput = scanner.next();		
		
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(Double.valueOf(userInput))) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
		}else {
		currentBalance += val;		
		System.out.println(currentBalance);
		}

	}

}
