package ch02_List;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx03 {
public static void main(String[] args) {
	// Member클래스 int sno, String name
	// 1,"홍길동", 2,"일지매", 3, "임꺽정" 저장하는 LinkedList생성하여 저장
	   List<Member> list = new LinkedList<>();
	   list.add(new Member(1,"홍길동"));
	   list.add(new Member(2,"일지매"));
	   list.add(new Member(3,"임꺽정"));
	//2. list에 일지매 객체가 존재하는지 확인
	   boolean result=list.contains(new Member(2,"일지매"));
	   System.out.println(result);
	//3. index번호 2번에 해당하는 객체를 4,"이순신" 으로 교체
	   list.set(2, new Member(4,"이순신"));
	//4. 전체 멤버를 출력
	   for(int i=0;i<list.size();i++) {
		    Member m=list.get(i);
		    System.out.println(m);
	   }
	//5. sort후 출력
	   list.sort(new Comparator<Member>() {
		@Override
		public int compare(Member o1, Member o2) {
			return   o2.getSno()-o1.getSno();//
		}
	});
	   for(int i=0;i<list.size();i++) {
		    Member m=list.get(i);
		    System.out.println(m);
	   }
}
}
class Member{
	private int sno;
	private String name;
	public Member(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Member [sno=" + sno + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return sno;
	}
	
	@Override
	public boolean equals(Object obj) {
		return sno==((Member)obj).getSno();
	}
	
	
}