package ch03;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
public static void main(String[] args) {
	IntBinaryOperator operator;
	
	//정적메소드 참조
	operator = new IntBinaryOperator() {
		@Override
		public int applyAsInt(int x, int y) {
			return Calculator.staticMethod(x, y);
		}
	};
	System.out.println("결과: " + operator.applyAsInt(3, 4));
	//람다식
	operator = (x, y) -> Calculator.staticMethod(x, y);
	//람다식에서 다른 객체의 static메소드 참조
	operator = Calculator :: staticMethod;
	System.out.println("결과: " + operator.applyAsInt(5, 6));
	
	//
	operator = new IntBinaryOperator() {
		@Override
		public int applyAsInt(int x, int y) {
			Calculator obj = new Calculator();
			return obj.instanceMethod(x, y);
		}
	};
	//람다식에서 다른 객체의 instance메소드 참조
	Calculator obj = new Calculator();
	operator = obj :: instanceMethod;
	System.out.println("결과: " +operator.applyAsInt(5, 6));
}
}
