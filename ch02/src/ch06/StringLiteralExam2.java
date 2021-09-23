package ch06;

public class StringLiteralExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String타입 변수를 선언하고 String리터럴을 대입
		String str = "Good";//내부적으로 아래와 같은 방법으로 객체를 생성함
		
		//String타입 변수를 선언하고 String이라는 객체를 생성하여 대입
		String str2 = new String("Good");
		
		System.out.println(str);
		System.out.println(str2);

	}

}
