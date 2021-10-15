package ch02_Wrapper;

public class WrapperEx {
public static void main(String[] args) {
	//boxing
	Integer obj1 = new Integer(10);
	Integer obj2 = new Integer("10");
	
	//aoto-boxing
	Integer obj3 = 10;
	
	//unboxing
	int i1 = obj1.intValue();
	int i2 = obj2.intValue();
	
	//aoto-unboxing
	int i3 = obj3;
	
	//값 비교시 equals()메소드 사용하거나, unboxing하여 기본타입으로 변경 후 비교연산 사용.
	System.out.println(obj1.equals(obj3));
	System.out.println(i1==i3);
	
}
}
