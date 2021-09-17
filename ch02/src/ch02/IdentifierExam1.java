package ch02;

public class IdentifierExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언
		//String @myname = "홍길동" - 특수문자 @로 시작하면 안됨x
		//int #no = 27; - 특수문자 # 사용 안됨x
		//int !age = 30; - 특수문자 ! 사용 안됨x
		
		String _name = "일지매"; //정상 _사용 됨o
		int $mony = 1000; //정상 $사용 됨o
		
		//특수문자에서 사용가능한 문자는 '$'와 '_'뿐이다
		//int no# = 20; - #사용 안됨x
		
		//int 1stJob = 1; - 숫자로 시작되는 변수명 안됨x
		int Job1st = 1; //정상 중간에 숫자 사용 됨o
		
		//int my count = 10; - my와 count사이에 공백 안됨x
		//int your	turn = 2; - your와 turn사이에 tab만큼의 공백 안됨x
		
		//길이에 제한 없음
		//변수명은 소문자로 시작
		//단어와 단어가 합쳐진 합성어인 경우 합쳐지는 뒤 단어의 첫글자는 대문자로 나머지는 소문자로 표시 - 관례
		//카멜 표기법
		String myCountryNameAndMycityNameAndMydongis = "대한민국서울강남";
		
		
		//변수 선언
		//타입 변수명(식별자) = 값 ;
		//int true = "참"; - true/false는 식별자로 사용불가x
		//boolean false = "거짓";
		
		//string null = "아무것도 없다"; - null도 식별자로 사용불가x
		
		//변수(식별자)는 대소문자를 구분함 Test와 test는 다른 변수임
		int Test = 10;
		int test = 20;
		
		//예약어 - 소문자로만 가능
		//int for = 10;-아스키 문자표 for = (컴퓨터)1100110 1101111 1110010, (십진수변환 값)102 111 114
		
		//사용가능		
		int FOR = 20; //아스키 문자표 FOR = (컴퓨터)1000110 1001111 1010010, (십진수변환 값)70  79  82
	}

}
