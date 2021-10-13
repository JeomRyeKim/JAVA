package ch05;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
			System.out.println("클래스 존재");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main()끝
	
	//컴파일오류
	public static void findClass() throws ClassNotFoundException{
		//Class - 클래스의 정보(메타)를 담는 클래스
		//forName(문자열클래스경로) -> 클래스 정보 담기
		Class clazz = Class.forName("java.lang.String2");
	}
}
