package ch02_String;

public class String1Ex3 {
public static void main(String[] args) {
	String subject = "자바 프로그래밍 자바 프로그래밍";
	//문자열내 old패턴(왼쪽) -> new패턴(오른쪽)으로 변경
	String subject2 = subject.replace("자바","java");//"java 프로그래밍 java 프로그래밍"
	
	System.out.println(subject2);
	
	//대소문자
	String org = "Java Programming";
	String lower = org.toLowerCase();
	String upper = org.toUpperCase();
	System.out.println(lower);
	System.out.println(upper);
	
	//의미없는 공백 자르기
	String tel1 = " 02";
	String tel2 = "123 ";
	String tel3 = "  1234  ";
	System.out.println(tel3.length());	
	//trim()
	String tel = tel1.trim()+"-"+tel2.trim()+"-"+tel3.trim();
	System.out.println(tel);
	
	//문자열 변환
	String str1 = String.valueOf(10);
	System.out.println(str1);
	String str2 = String.valueOf(10.1);
	System.out.println(str2);	
}
}
