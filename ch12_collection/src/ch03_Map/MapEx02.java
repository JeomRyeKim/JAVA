package ch03_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//도시별 온도를 저장하고 도시명에 해당하는 온도 출력
public class MapEx02 {
public static void main(String[] args) {
	Map<String, Double> cities = new HashMap<String, Double>();
	cities.put("서울", 32.5);
	cities.put("베이징", 35.8);
	cities.put("홍콩", 39.5);
	cities.put("서울", 38.7);//동일키로 값을 저장하면 제일 마지막의 value로 선택됨(출력이 32.5 -> 38.7로 변함)
	//키들만 추출 - set은 중복X -> 마지막 value인 "서울" 38.7로 출력됨.
	Set<String> keyset = cities.keySet();
	//반복자를 이용하여 전체키를 하나씩 가져옴
	Iterator<String> itor = keyset.iterator();
	while(itor.hasNext()) {
		String key = itor.next();//키 한개 가져오기
		double cc = cities.get(key);//키로 값 가져오기
		System.out.println(key+"도시의 온도는 "+cc);
	}
	
	//서울의 온도를 출력하세요
	double c = cities.get("서울");
	System.out.println("서울의 온도는:"+c);
	//홍콩의 온도
	c = cities.get("홍콩");
	System.out.println("홍콩의 온도는:"+c);
}
}
