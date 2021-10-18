package ch02_List;

import java.util.Vector;

public class Vector01 {
public static void main(String[] args) {
	Vector<Integer> v = new Vector<Integer>(7);
	//List<Integer> v = new Vector<Integer>(7);
	//System.out.println(v.capacity());
	//요소삽입
	v.add(5);
	v.add(new Integer(4));
	v.add(-1);
	
	//저장된 갯수 size()
	System.out.println(v.size());
	
	//중간 삽입
	v.add(2,100);
	//v.add(5,100);//java.lang.ArrayIndexOutOfBoundsException: 5 > 4
	
	//전체 출력
	for(int i=0;i<v.size();i++)
		System.out.println(v.get(i));
	
	//요소 얻기
	Integer obj = v.get(1);
	int i=obj.intValue();
	System.out.println(i);
	
	int j=v.get(1);//auto-unboxing;
	System.out.println(j);
	
	//삭제
	v.remove(1);
	//v.remove(4);// java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 4
	
	//마지막 요소
	int last =v.lastElement();
	System.out.println(last);
	
	//모든요소 삭제
	v.removeAllElements();
	
	//비어있는지 확인 isEmpty();
	System.out.println(v.isEmpty());
	
}
}