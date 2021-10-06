package ch07_final;
//a - b - c - ch07_final
//a.b.c.ch07_final.Person
//ch07_final.Person
public class Person {
//final필드는 선언과 동시에 초기화
final String nation = "korea";
//생성자에서 final필드를 초기화할 수 있는 경우 선언만 해놔도 오류 발생하지 않음.
final String ssn;
String name;
//생성자에 final필드를 초기화하는 명령문 포함.
public Person(String ssn, String name) {
	this.ssn = ssn;
	this.name = name;
}

public static void main(String[] args) {
	Person person = new Person("20010101-1234567","홍길동");
	//person.nation = "usa"; - final이니까 안됨.
	//person.ssm = "1234"; - final이니까 안됨.
	//person.name = "일지매"; - 얘는 일지매로 바뀜 수정가능함.
	System.out.println(person.nation);
	System.out.println(person.ssn);
	System.out.println(person.name);
	Person person2 = new Person("20010101-1234567","홍길동");
}

}
