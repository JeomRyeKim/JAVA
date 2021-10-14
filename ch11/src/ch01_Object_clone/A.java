package ch01_Object_clone;

public class A implements Cloneable {
	int a;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
}
