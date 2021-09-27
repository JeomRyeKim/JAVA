package ch01;

public class ReferencesExam01 {
public static void main(String[] args) {
	//리터럴로 문자열 생성 - 리터럴 특성 따름.
	String strA = "홍길동";//100번지에 홍길동이라는 객체를 만들어서 str A,B가 100번지 홍길동 객체를 같이 사용함.
	String strB = "홍길동";//String이 참조타입이지만 리터럴을 사용해서 만들면 같은 주소값을 이용함.
	if(strA==strB) System.out.println("같은 문자열을 참조한다.");
	else System.out.println("다른 문자열을 참조한다.");
	
	//new String() - 생성자로 문자열 생성 - 참조타입 특성 따름.
	//참조타입은 생성시 new 클래스명();으로 생성
	String str1 = new String("홍길동");//300번지 홍길동 객체 만들어서 사용
	String str2 = new String("홍길동");//400번지 홍길동 객체 만들어서 사용
	if(str1==str2) System.out.println("같은 문자열을 참조한다.");
	else System.out.println("다른 문자열을 참조한다.");
	
	//
	//str1 = "일지매";//450번지 일지매 객체가 새로 만들어져 바뀜.
	//str1 = "홍길동일지매";//500번지 홍길동일지매 객체가 새로 만들어져 바뀜

	}

}
