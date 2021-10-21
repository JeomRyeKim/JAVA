package ch02;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = {92,95,87};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score:scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
public static void main(String[] args) {
	//최대값 얻기
	int max = maxOrMin(new IntBinaryOperator() {
		@Override
		public int applyAsInt(int left, int right) {
			return left>=right ? left : right;
		}
	});
	System.out.println("최대값:" + max);
	
	//람다식
	max = maxOrMin((a, b) -> a>=b ? a : b);
	System.out.println("최대값:" + max);
	
	//최소값 얻기
	int min = maxOrMin(new IntBinaryOperator() {
		@Override
		public int applyAsInt(int a, int b) {
			return a>=b ? b : a;
		}
	});
	System.out.println("최소값:" + min);
	
	//람다식
	min = maxOrMin((a, b) -> a>=b ? b : a);
	System.out.println("최소값:" + min);
	
	
}
}
