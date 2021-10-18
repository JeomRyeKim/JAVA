package verify;

public class Ex7 {
	public static void main(String[] args) {
		System.out.println("7.다음 문자열에서 \"자바\" 문자열이 포함되어 있는지 확인하고, \"자바\"를 Java로 대치한 새로운 문자열을 만들어보라.");
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index =str.indexOf("자바");//해당문자위치index값리턴, -1을 리턴
		if(index==-1) {
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		}else {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			str=str.replace("자바", "Java");//"모든 프로그램은 Java 언어로 개발될 수 있다.";
			System.out.println("--->"+str);
		}
	}
}