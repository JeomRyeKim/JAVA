package ch05;

public class BooleanExam {
	public static void main(String[] args) {
		/* 참/거짓의 값을 가지는 boolean타입 리터럴 */
		
		boolean b = true;//초기값 true나 false
		boolean c = 10 > 0;//연산의 결과 true/false값
		
		//대입 연산자 =을 기준으로 왼쪽은 boolean 오른쪽은 int 형변환 불가
		//boolean d = 1;
		
		//boolean타입의 리터럴의 반복문 종료 조건에 사용됨
		int i=1;
		while(b) {
			System.out.println(i);
			System.out.println("hello");
			i++; //i=i+1;
			if(i==10) b=false;
		}

		System.out.println("종료");
		
		//현재 b값이 false이므로 아래 블럭은 실행 안함
		if(b) {
			System.out.println("hello");
		}
	}

}
