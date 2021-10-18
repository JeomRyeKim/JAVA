package verify;

public class Ex4 {
public static void main(String[] args) {
	System.out.println("4.Member 클래스를 작성하되, Object의 toString() 메소드를 "
			   + "오버라이딩해서 MemberExample클래스의 실행 결과처럼 나오도록 작성해보시오.");
	Member member = new Member("blue","이파란");
	System.out.println(member);//toString()자동 호출
}
}

class Member{
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id+": "+name;
	}

}