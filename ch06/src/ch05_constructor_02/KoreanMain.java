package ch05_constructor_02;

public class KoreanMain {
	public static void main(String[] args) {
		//매개변수 있는 생성자가 존재하므로 컴파일시
		//default생성자가 추가 안되어서 호출불가.
		//Korean korean = new Korean();
		Korean korean1 = new Korean("홍길동","011225-1234567");
		System.out.println(korean1.name);
		System.out.println(korean1.sno);
		Korean korean2 = new Korean("일지매","930525-0654321");
		System.out.println(korean2.name);
		System.out.println(korean2.sno);

	}

}
