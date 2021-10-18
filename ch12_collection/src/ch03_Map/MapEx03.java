package ch03_Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx03 {
public static void main(String[] args) {
	Map<String, Double> cities = new HashMap<String, Double>();
	cities.put("서울", 32.5);
	cities.put("베이징", 35.8);
	cities.put("홍콩", 39.5);
	cities.put("서울", 38.7);
	
	//키 존재 여부 확인
	System.out.println(cities.containsKey("베이징"));
	//값 존재 여부 확인 - "서울" 32.5 -> 38.7 바뀌어서 32.5는 없는 값이라고 false로 뜸.
	System.out.println(cities.containsValue(32.5));//38.7 -> Integer(38.7) AutoBoxing
	
	//저장된 개수 size();
	System.out.println(cities.size());// 3개(바뀐값은 없음)
	
	//특정 키에 해당하는 객체 삭제 - 삭제 후 삭제 값 리턴remove(키);
	System.out.println(cities.remove("홍콩"));
	
	//전체 삭제
	cities.clear();
	
	//비어있는지 확인
	System.out.println(cities.isEmpty());	
}
}
