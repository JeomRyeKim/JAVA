package ch01;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
	//선언된 참조 변수가 객체를 참조하지 않을 때 NullPointerException발생
//	String str = null;	
//	System.out.println(str.toString());
	String str = null;
	//예외 처리 구문 try{}catch(){}로 작성
	try {
		//예외발생 가능한 명령문
		System.out.println(str.toString());
	}catch (NullPointerException e) {//try{}블럭에서 발생한 예외는 catch(){}블럭에서 처리
		//예외 처리 블럭
		System.out.println(e.toString());//발생한 예외의 내용출력 toString();
		//디버깅용 예외 메시지 출력
		e.printStackTrace();
	}
	}

}
