package ch02_String;

public class String1Ex {
public static void main(String[] args) {
	String ssn = "010624-1230123";
	//문자열 내의 "패턴"의 위치 index값
	int index = ssn.indexOf("-");
	System.out.println(index);
	
	//위치 index값에 해당하는 문자하나 추출 charAt(index번호);
	char gender = ssn.charAt(index+1);
	
	switch(gender) {
	case '1':
	case '3': System.out.println("남"); break;
	case '2':
	case '4': System.out.println("여"); break;
	}
	
	//문자열의 길이 - length
	char[] chars = new char[ssn.length()];
	for(int i=0; i<chars.length; i++) 
		chars[i]=ssn.charAt(i);
		
		for(int i=0; i<chars.length; i++)
		System.out.print(chars[i]);	
}
}
