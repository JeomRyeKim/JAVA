package ch03;

/* 리터럴은 타입을 가진다 - 표시되는 형식에 따라 컴퓨터(JVM) 타입을 인식함 */
public class LiteralExam3 {
	public static void main(String[] args) {
		//실수타입 변수 선언하고 실수 리터럴 대입
		double d1 = 12.;
		double d2 = 12.0;
		double d3 = 0.1234;
		double d4 = 1234e-4;// e는 10을 의미
		double d5 = 1234E-4;// 1234*10^-4
		double d6 = 1234e2;// 1234*10^2
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		
		//실수리터럴 f는 32비트 범위, 실수리터럴 d는 2배정도 64비트 범위
		float f = 0.1234f;
		double w = .1234d;
		//대입연산자 =을 기준으로
		//왼쪽은 32비트를 저장할 수 있는 범위의 공간,
		//오른쪽은 64비트 길이를 가진 리터럴
		//저장불가
		//float f2 = .1234d;
		double w2 = 0.1234f;
		
		//실수타입의 리터럴은 숫자값 뒤에 f나, d표시를 하지 않으면
		//default로 d(double)로 인식함
		//float f3 = .1234;
		
		
	}

}
