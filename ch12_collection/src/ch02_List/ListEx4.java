package ch02_List;

import java.util.ArrayList;
import java.util.List;

public class ListEx4 {
public static void main(String[] args) {
	//List String타입 "홍길동","일지매","임꺽정", Integer타입 10,20,30
	List list = new ArrayList();
	list.add("홍길동");//String -> Object
	list.add("일지매");
	list.add("임꺽정");
	list.add(10);//Integer -> Object
	list.add(20);
	list.add(30);
	
	//을 같이 저장하는 List만들고 값들을 모두 저장 후, 출력
	for(int i=0; i<list.size(); i++)
		System.out.println(list.get(i));//Object -> String/Integer
}
}
