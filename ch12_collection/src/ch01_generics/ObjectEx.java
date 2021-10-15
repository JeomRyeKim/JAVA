package ch01_generics;

public class ObjectEx {
public static void main(String[] args) {
	A a = new A("10");
	a.method("10");

	a.method(20);
}
}

class A{
	Object field;
	A(Object field){
		this.field = field;
	}
	//°´Ã¼ -> Object -> casting
	void method(Object var) {
		System.out.println(Integer.parseInt((String)field)//String
							+ Integer.parseInt((String)var));//Integer
	}
}