package ch02;

public class ConditionOpetatorExam2 {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		
		// 조건 ? 참 : 거짓
		System.out.println("두 수의 차는 "+( a>b ? a-b : b-a ));
		
		//a가 크다, b가 크다, 둘 다 같다
		//조건 ? 참 : (조건 ? 참 : 거짓)
		System.out.println("두 수의 차는 "+( a>b ? "a가 크다" : a<b ? "b가 크다" : "같다" ));
		

	}

}
