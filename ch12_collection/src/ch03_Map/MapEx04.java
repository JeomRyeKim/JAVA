package ch03_Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx04 {
public static void main(String[] args) {
	//1."홍길동", 2."일지매", 3."임꺽정", 2."이순신"
	//값을 저장하는 Map을 만들고, 저장 후
	//저장된 객체의 개수 확인
	//Map에서 3번 키에 해당하는 객체를 출력해보세요
	Map<Integer, String> name = new HashMap<Integer, String>();
	name.put(1, "홍길동");//기본타입 int -> Integer로 AutoBoxing
	name.put(new Integer(2), "일지매");
	name.put(new Integer("3"), new String("임꺽정"));
	name.put(2, "이순신");//int -> Integer
	
	System.out.println(name.size());
	
	System.out.println(name.get(3));//AutoBoxing
	
	System.out.println(name.get(2));//AutoBoxing - 이순신 출력
	
}
}