package ch04.copy;

public class ExMan {
public static void main(String[] args) {
	//다형성
	A a1 = new B();
	A a2 = new C();
	A a3 = new D();
	A a4 = new E();
	
	//배열 - 동일한 타입이 연속 나열
	A[] arr = new A[5];
//	arr[0] = new A();
	arr[1] = new B();//B -> A
	arr[2] = new C();//C -> A
	arr[3] = new D();//D -> A
	arr[4] = new E();//E -> A
	
	for(int i=1; i<arr.length; i++) {
		System.out.println(arr[i] instanceof A ? "A타입" : "A타입 아님");
	}
	

}
}
