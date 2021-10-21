package ch01_03;

public class Ex03 {
public static void main(String[] args) {
	//10,20을 받아서 더한 결과 30을 리턴하는 메소드
	//1.무명, 2.람다
	MyFunctionalIterface fi = new MyFunctionalIterface() {
		@Override
		public int method(int x, int y) {
//			int result = x + y;
//			return result;
			return x+y;
		}
	};
	
	int res = fi.method(10, 20);
	System.out.println(res);
	
	//람다식
	fi = (x, y) -> x + y; //return도 생략 가능
	res = fi.method(10, 20);
	System.out.println(res);
}
}
