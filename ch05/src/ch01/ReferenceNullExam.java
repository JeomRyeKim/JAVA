package ch01;

public class ReferenceNullExam {
public static void main(String[] args) {
	String str1 = new String("홍길동");//100번지 홍길동 객체 만들어짐
	System.out.println(str1);
	//출력
	str1 = null;//100번지 홍길동 객체가 스택에 가는 길을 null이 끊어버림, null이라는 객체가 새로 생기는건 아님.
	System.out.println(str1);//null
	}

}
