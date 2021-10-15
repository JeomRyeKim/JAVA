package ch01_generics;

public class GStack<T> {
	int tos; 
	Object [] stck;
	public GStack() {
		tos = 0; 
		stck = new Object [10];
	}
	public void push(T item) {
		if(tos == 10)
			return; 
		stck[tos] = item;
		tos++;
	}
	public T pop() {
		if(tos == 0)
			return null;
		tos--; 
		return (T)stck[tos]; 
	}
}