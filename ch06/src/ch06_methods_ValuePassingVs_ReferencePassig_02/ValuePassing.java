package ch06_methods_ValuePassingVs_ReferencePassig_02;

public class ValuePassing {

	public static void main(String[] args) {
		int n = 10;
		//매개변수값으로 기본타입 int 10의 값이 전달됨(값복사)
		increase(n);
		
		//n은 increase()메소드에 의해 영향을 받지않음.
		System.out.println(n);

	}
	//복사되어 넘어온 int 10을 받아서 메소드내에서 처리.
	static void increase(int m) {
		m=m+1;
	}

}
