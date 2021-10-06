package ch06_methods;

class Test{
	//필드
	int min, max, sum;
	//메소드
	void sum() {
		sum = min+max;
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.min=20; t1.max=30;
		t1.sum();
		System.out.println("합계:"+t1.sum);
	}
	

}
