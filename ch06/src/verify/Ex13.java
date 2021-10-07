package verify;
public class Ex13 {
public static void main(String[] args) {		
	Member user1 = new Member("홍길동","hong");
	//default생성자를 호출하여 객체를 생성하려면
	//클래스에 default생성자를 추가해주어야함.
	Member user2 = new Member();
	user2.setId("java");
	user2.setName("김자바");
}
}
class Member {
//필드 - 13번 문제
private String name;
private String id;
private String password;
private int age;

//생성자 - 14번 문제
public Member(String name, String id) {
	this.name = name;
	this.id = id;
}

//default생성자
public Member() {}

//메소드
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}