package ch06_methods;

public class Clac01Main {

	public static void main(String[] args) {
		//°´Ã¼»ý¼º
		//1
		Calc01 cal = new Calc01();
		int res1 = cal.add(10, 20);
		System.out.println(res1);	
		//2
		cal.i=10; cal.j=20;
		int res2 = cal.divid();
		System.out.println(res2);
		//3
		cal.sub(10, 20);
		//4
		cal.mul();
	}

}
