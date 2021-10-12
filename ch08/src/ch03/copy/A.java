package ch03.copy;

public class A implements MyInterface {

	@Override
	public void method1() {}
	@Override
	public void method2() {}
}
class B implements MyInterface{
	@Override
	public void method1() {}
	@Override
	public void method2() {}
	@Override
	public void method4() {}
	
}
class C implements MyInterface{
	@Override
	public void method1() {}
	@Override
	public void method3() {}
}