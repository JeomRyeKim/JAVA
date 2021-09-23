package ch02;

public class ArithmeticExam {

	public static void main(String[] args) {
		int time = 5000;
		
		System.out.println("시분초로 출력하기");
		
		//몫과 나머지
		int second = time % 60;// 5000초 = minute * 60 + 나머지 초
		int minute = (time/60) % 60;//
		int hour = (time/60) / 60;//
		
		System.out.println(time + "초는");
		System.out.println(hour + "시간");
		System.out.println(minute + "분");
		System.out.println(second + "초입니다.");
	}

}
