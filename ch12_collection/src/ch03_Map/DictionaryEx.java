package ch03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryEx {
public static void main(String[] args) {
	//"apple"-"사과", "pear"-"배", "peach"-"복숭아", 
	//"puppy"-"강아지", "cow"-"소", "zebra"-"얼룩말", "chicken"-"닭"
	//맵에 저장하고 후
	//scanner로 영문을 입력받아서 해당하는 한글을 출력
	//map에 키가 없으면 다시 입력하도록
	//끝낼때는 "end"가 입력되면 종료;
	Scanner scanner = new Scanner(System.in);
	Map<String, String> dictionarys = new HashMap<>();
	dictionarys.put("apple", "사과");
	dictionarys.put("pear", "배");
	dictionarys.put("peach", "복숭아");
	dictionarys.put("puppy", "강아지");
	dictionarys.put("cow", "소");
	dictionarys.put("zebra", "얼룩말");
	dictionarys.put("chicken", "닭");
	dictionarys.put("cat", "고양이");
	
	while(true) {
	//조회할 단어
	System.out.println("조회할 영단어를 입력하세요>");
	String key = scanner.next();
	if(!key.equals("end")) {
	 if(dictionarys.containsKey(key)){
		System.out.println(dictionarys.get(key));
	 }else {
		 System.out.println("해당하는 단어가 없습니다.");
	 }
	}else 
		break;
		
	}//
	System.out.println("종료");
}
}
