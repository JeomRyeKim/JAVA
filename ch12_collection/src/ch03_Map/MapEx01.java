package ch03_Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapEx01 {
public static void main(String[] args) {
	//Map인터페이스 선언
	Map<String, String> fruits = new HashMap<String, String>();
	//동기화 처리 Collections.synchronizedXXX();
	fruits = Collections.synchronizedMap(fruits);
	
	//pub(key,value);
	fruits.put("apple", "사과");//key="apple", value="사과"
	//get(key)의 리턴 값 value
	String value = fruits.get("apple");
	System.out.println(value);//value인 "사과"출력	
}
}
