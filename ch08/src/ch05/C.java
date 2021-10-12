package ch05;

public interface C extends InterfaceA, InterfaceB {
 void methodC();
}
class CA implements C{
	@Override
	public void methodA() {	}
	@Override
	public void methodB() {	}
	@Override
	public void methodC() {}	
}
