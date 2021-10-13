package ch01_Object;

public class MemberEx1 {
	public static void main(String[] args) {
		//String객체는 문자열이 같으면 동등객체로 저리함.
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		
		//논리적 동등
		System.out.println(str1.equals(str2));
		
		//물리적 다른 객체 - 만들어진 위치가 다름.
		Member member1 = new Member("홍길동");
		Member member2 = new Member("홍길동");
		Student student = new Student("홍길동");
		
		//논리적 동등 - 내용이 같으면 동등한 객체로 처리
		//
		System.out.println(member1.equals(member2));
		
	}

}
