package ch01_generics;

public class GenericMethodEx {
	//T가 타입 매개 변수인 제네릭 메소드
	public static <T> GStack<T> reverse(GStack<T> a){//0.0, 1.0, 2.0, 3.0, 4.0
		GStack<T> s = new GStack<T>();
		while(true) {
			T tmp;
			tmp = a.pop();//원래 스택에서 요소하나를 꺼냄 4.0, 3.0, 2.0, 1.0, 0.0
			if(tmp==null) break;//스택이 비었음.
			else s.push(tmp);//새 스택에 요소 삽입 //4.0, 3.0, 2.0, 1.0, 0.0
		}
		return s;
	}
}
