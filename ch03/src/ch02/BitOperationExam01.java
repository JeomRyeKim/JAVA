package ch02;

public class BitOperationExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte flag = 0b00001010;//각 비트는 8개의 센서 비트
		
		if((flag & 0b00001000) == 0)//비트 논리 연산 결과가 0인지 비교
			System.out.println("온도는 0도 이하");
		else
			System.out.println("온도는 0도 이상");

	}

}
