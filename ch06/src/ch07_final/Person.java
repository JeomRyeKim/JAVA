package ch07_final;
//a - b - c - ch07_final
//a.b.c.ch07_final.Person
//ch07_final.Person
public class Person {
//final�ʵ�� ����� ���ÿ� �ʱ�ȭ
final String nation = "korea";
//�����ڿ��� final�ʵ带 �ʱ�ȭ�� �� �ִ� ��� ���� �س��� ���� �߻����� ����.
final String ssn;
String name;
//�����ڿ� final�ʵ带 �ʱ�ȭ�ϴ� ��ɹ� ����.
public Person(String ssn, String name) {
	this.ssn = ssn;
	this.name = name;
}

public static void main(String[] args) {
	Person person = new Person("20010101-1234567","ȫ�浿");
	//person.nation = "usa"; - final�̴ϱ� �ȵ�.
	//person.ssm = "1234"; - final�̴ϱ� �ȵ�.
	//person.name = "������"; - ��� �����ŷ� �ٲ� ����������.
	System.out.println(person.nation);
	System.out.println(person.ssn);
	System.out.println(person.name);
	Person person2 = new Person("20010101-1234567","ȫ�浿");
}

}
