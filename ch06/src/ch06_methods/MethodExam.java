package ch06_methods;

public class MethodExam {
		//1. 매개변수 있고, 리턴타입 있는 메소드
		// - 매개변수값을 받아서 처리하고 결과를 다시 해당리터런타입으로 되돌려줄 떼 사용.
		int sum(int x, int y) {
			return x+y;
		}
		//2. 매개변수 없고, 리턴타입 있는 메소드
		// - 호출시 결과값만 되돌려주는 경우 사용
		String greeting() {
			return "hello";
		}
		//3. 매개변수 있고, 리턴타입 없는 메소드 (void)
		// - 매개변수는 받고 해당 메소드내에서 처리하고 결과를 되돌려 주지 않을 때 사용.
		void sumVoid(int x, int y) {
			System.out.println("result =" + (x+y));
		}
		//4. 매개변수 없고, 리턴타입 없는 메소드 (void)
		// - 호출시 메소드내에서 처리하고 결과를 되돌려주지 않는 경우 사용.
		void greetingVoid() {
			System.out.println("hi");
		}
	

}
