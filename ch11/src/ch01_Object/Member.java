package ch01_Object;

//thread, collection, network, file입출력
public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

//Object로부터 상속받은
//equals메소드를 재정의하여 논리적 동등 여부 만들기
@Override
public boolean equals(Object obj) {
	//비교시
	//같은 타입이 아니면 false
	if(obj instanceof Member) {
		//같은 타입이면 id값끼리 비교한 결과 true/false
		Member other = (Member)obj;
		return this.id.equals(other.id);
//		return this.id.equals(((Member)obj).id);
	}
	return false;
}
	
}
