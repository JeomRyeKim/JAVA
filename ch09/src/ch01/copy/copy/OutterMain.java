package ch01.copy.copy;

public class OutterMain {
public static void main(String[] args) {
	//클래스.static멤버로 접근
	A.C c = new A.C();
	//C의 인스턴스멤버
	c.field1=3;
	c.method1();
	//C의 static멤버
	//바깥클래스.안쪽클래스.멤버
	A.C.field2=3;
	A.C.method2();
}
}
