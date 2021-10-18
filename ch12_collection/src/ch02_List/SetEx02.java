package ch02_List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetEx02 {
public static void main(String[] args) {
	//Set인터페이스로 선언된 set생성
	//Member1 String sno, String name으로 구성
	//"1","홍길동"  "2","일지매"  "3","임꺽정"  "2","일지매"
	//중복배제하여 저장 후 모든 객체를 출력
	Set<Member1> set = new HashSet<Member1>();
	set.add(new Member1("1", "홍길동"));
	set.add(new Member1("2", "일지매"));
	set.add(new Member1("3", "임꺽정")); 
	set.add(new Member1("2", "일지매")); 
	
	//출력 - 뒤죽박죽 출력
	Iterator<Member1> itor = set.iterator();
	while(itor.hasNext()) {
		Member1 m = itor.next();
		System.out.println(m);
	}
	
	System.out.println("----------------");
	for(Member1 m:set)
		System.out.println(m);
 	
}
}

class Member1{
	private String sno;
	private String name;
	public Member1(String sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public String getSno() {return sno;}
	public String getName() {return name;}
	
	@Override
	public String toString() {
		return "Member1 [sno=" + sno + ", name=" + name + "]";
	}
	//hashCode와 equals를 하니 순서대로 정리가 됨 대신 중복은 사라짐.
	//hashCode
	@Override
	public int hashCode() {
		return Objects.hash(name, sno);
	}

	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member1 other = (Member1) obj;
		return Objects.equals(name, other.name) && Objects.equals(sno, other.sno);
	}
}