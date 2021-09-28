package ch03_array;

public class A {
	//타입[] 변수명;
	//String[] args
	//main()메소드의
	//매개변수부분()에 들어가는 배열 String[] args
	//는 길이가 정해져있지 않은 배열
	//자바프로그램 실행시 arguments로 나열해서 전달함. - 공백을 기준으로 구분됨.
	//아규먼트의 개수만큼 String[] 배열 생성되어서 전달.
	//java A hello world my name is 길동
	//=> String[] args = {hello,world,my,name,is,길동};
	public static void main(String[] args) {//arguments, 인자, 매개변수 부분
		
		System.out.println("배열의 길이:" + args.length);
		System.out.println("배열의 첫번째 값:" + args[0]);// Run Configuration에서  Program arguments에 값 입력하기.
		System.out.println("배열의 두번째 값:" + args[1]);
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}

	}

}
