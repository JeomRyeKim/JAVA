package ch02_Objects_isNull;

import java.util.Objects;

public class NullEx {
public static void main(String[] args) {
	String s1 = "홍길동";
	String s2 = null;
	
	System.out.println(Objects.requireNonNull(s1));
//	System.out.println(Objects.requireNonNull(s2));//예외발생
	
	//null여부확인
	System.out.println(Objects.isNull(s1));
	System.out.println(Objects.isNull(s2));
	
	//메세지 출력
//	System.out.println(Objects.requireNonNull(s2,"이름이 없음."));
	
	//toString()
	System.out.println(Objects.toString(s1));
	System.out.println(Objects.toString(s2));//"null"
	System.out.println(Objects.toString(s2,"이름이 없습니다."));//지정한 메시지
	
}
}
