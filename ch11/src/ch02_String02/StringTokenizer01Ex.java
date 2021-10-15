package ch02_String02;

import java.util.StringTokenizer;

public class StringTokenizer01Ex {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(text,"/");//(text,구분자)
		
		//현재 저장된 토큰들(개수)
		System.out.println(st.countTokens());
		//추출
		while(st.hasMoreTokens()) {//남은 토큰이 있는지 확인
			String token = st.nextToken();//토큰 추출
			System.out.println(token);
			System.out.println(st.countTokens());//남은 토큰들
		}
	}
}
