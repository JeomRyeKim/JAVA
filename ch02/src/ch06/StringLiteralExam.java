package ch06;

public class StringLiteralExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//영문, 한글 저장
		String str1 = "Good";
		String str2 = "Morning";
		String str3 = "자바";
		
		//숫자형 문자열
		String str4 = "3.19";
		String str5 = "26";
		//숫자형 문자열을 숫자타입으로 변경 가능
		 int n1 = Integer.parseInt(str5);
	     double d1 = Double.parseDouble(str4);
	     double result = n1 + d1;

		
		System.out.println(n1);
		System.out.println(d1);
		System.out.println(result);
		
		//문자하나 저장한 문자열
		String str6 = "a";
	}

}
