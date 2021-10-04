package ch06_methods;

public class Calc {
int plus(int x, int y) {
	int result = x + y;
	return result;
	//return문 이후에는 명령문이 올 수 없음.(실행문까지 올 수 없기때문)
	//System.out.println("결과:" + result);
}
}
