package ch02_List;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList02 {

	public static void main(String[] args) {
		//1.String객체를 담는 LinkdeList를 만들고 
		List<String> list = new LinkedList<>();
		//2."홍길동", "일지매", "임꺽정" 을 저장 후
		list.add("홍길동");list.add("일지매");list.add("임꺽정");
		//3.저장된 갯수를 리턴하도록 작성
		System.out.println(list.size());
		//4. "이순신"이 들어있는지 확인
		System.out.println(list.contains("이순신"));
		//5. 모든 객체를 출력 [a][a][null][a][null][a]
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		//10.sort
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("=============");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println("=============");
		//6. index번호 2번에 해당하는 객체를 "유관순"으로 변경하세요.
		System.out.println(list.set(2, "유관순"));
		
		System.out.println("============");
		//7. index번호 2번에 해당하는 객체를 출력하세요
		System.out.println(list.get(2));
		//8. 리스트내의 모든 객체를 삭제후  
		list.clear();
		//9. 리스트가 비어있는지 확인 메세지를 출력
		System.out.println(list.isEmpty());
	}
}