package ch02_String;

public class String1Ex4 {
public static void main(String[] args) {
	String str = "Korea Fighting !!";//18자
	
	for(int i=str.length()-1; i>=0; i--) {
		System.out.print(str.charAt(i));//끝에서부터 출력됨.
	}
	System.out.println();
	
	for(int i=0; i<str.length(); i+=2) {
		System.out.print(str.charAt(i));
	}
	
	//valueOf
	int i=100;
	String str1 = i+"";//int + String -> String
	String str2 = String.valueOf(i);//-> String
	System.out.println(str1 + str2);
	
	//
	String s1 = "200";
	int i1 = Integer.parseInt(s1);//"200" -> 200
	int i2 = Integer.valueOf(s1);//"200"로 Integer타입으로 객체 생성
	System.out.println(i1+i2);//int + int -> int
	
	//indexOf
	String str3 = "Hello.java.대박.hh";
	int index1 = str3.indexOf(".");//index값
	int inedx2 = str3.lastIndexOf('.');//마지막 index값
	
	System.out.println(index1);
	System.out.println(inedx2);
	
	int index3 = str3.indexOf("--");//없는 패턴이라 -1을 리턴
	System.out.println(index3);
	System.out.println(index3 == -1 ? "찾는 문자가 없습니다" : "찾는 문자가 있습니다.");
	
	
}
}
