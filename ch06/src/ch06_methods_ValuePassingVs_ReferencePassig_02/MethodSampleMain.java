package ch06_methods_ValuePassingVs_ReferencePassig_02;

public class MethodSampleMain {
	public static void main(String[] args) {
		MethodSample m = new MethodSample();
		//�����ε��� �޼ҵ� �� �Ű������� Ÿ�Կ� 
		//�´� �޼ҵ带 ã�Ƽ� ����(jvm)
		System.out.println(m.gatSum(10.0, 20.0));
		System.out.println(m.gatSum(10, 20));
		System.out.println(m.gatSum(10, 20, 30));		
	}

}
