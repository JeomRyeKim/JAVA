package ch07;

public class VariableExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 10까지의 합 출력
		System.out.println(1+2+3+4+5+6+7+8+9+10);
		
		//계산결과를 저장하거나 값을 자동증가 시키거나 변경된 값을 저장하는 공간 - 변수
		//1부터 1000까지의 합 출력
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}

}
