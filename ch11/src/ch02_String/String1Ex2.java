package ch02_String;

public class String1Ex2 {
public static void main(String[] args) {
	String subject = "자바 프로그래밍 자바 프로그래밍";
	//문자열내에서 처음 만나는 index위치
	int index = subject.indexOf("프로그래밍");
	//문자열내에서 마지막으로 만나는 index위치
	int index2 = subject.lastIndexOf("프로그래밍");
	System.out.println(index);
	System.out.println(index2);
	
	String fileName = "fff.sss.aaa.jpg";
	//문자열 내의 마지막위치
	int lastIndex = fileName.lastIndexOf(".");
	//문자열 자르기 substring(시작,끝), substring(시작);
	String ext = fileName.substring(lastIndex+1);
	System.out.println(ext);
}
}
