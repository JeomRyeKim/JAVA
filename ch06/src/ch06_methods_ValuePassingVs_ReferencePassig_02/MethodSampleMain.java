package ch06_methods_ValuePassingVs_ReferencePassig_02;

public class MethodSampleMain {
	public static void main(String[] args) {
		MethodSample m = new MethodSample();
		//오버로딩된 메소드 중 매개변수의 타입에 
		//맞는 메소드를 찾아서 실행(jvm)
		System.out.println(m.gatSum(10.0, 20.0));
		System.out.println(m.gatSum(10, 20));
		System.out.println(m.gatSum(10, 20, 30));		
	}

}
