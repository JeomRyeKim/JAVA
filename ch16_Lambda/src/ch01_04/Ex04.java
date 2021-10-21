package ch01_04;

public class Ex04 {
public static void main(String[] args) {
	MyFunctionalInterface fi = new MyFunctionalInterface() {
		@Override
		public int method(int x, int y) {
			return sum(x, y);//메소드 호출
		}
	};
	//호출
	System.out.println(fi.method(10, 20)); 
	
	//람다식 - 함수 호출 결과 리턴
	fi = (x, y) -> sum(x, y);
	System.out.println(fi.method(10, 20)); 	
}
public static int sum(int x, int y) {
	return x+y;
}
}
