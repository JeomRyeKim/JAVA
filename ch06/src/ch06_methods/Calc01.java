package ch06_methods;

public class Calc01 {
	//필드
	int i=0, j=0;
	//합1(매개변수O, 리턴타입O)
	public int add(int x, int y) {
		return x+y;
	}
	//나누기2(매개변수X,리턴타입O)
	public int divid() {
		return i/j;
	}
	//빼기3(매개변수O,리턴타입X)
	public void sub(int x, int y) {
		System.out.println(x-y);
	}
	//곱하기4(매개변수X,리턴타입X)
	public void mul() {
		System.out.println(i*j);
	}
	
}
