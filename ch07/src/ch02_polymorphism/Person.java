package ch02_polymorphism;

public class Person {
	public static void main(String[] args) {
		Person p;
		Student s = new Student("홍길동");
		p = s; //promotinon(upcasting)
		
		//원래 부모클래스에 존재하는 필드는 접근가능
		System.out.println(p.name);
		//자식클래스에서 추가된 메소드는 부모타입으로 형변환 후에는 접근 불가.
		//p.grade = "A";
		//p.department = "Com";
		
		//강제 형변환(downcasting)
		s = (Student)p;//원래 자식타입으로 변환
		
		//가져렸던 자식영역의 필드와 메소드에 접근 가능
		System.out.println(s.name);
		s.grade="A";
		s.department="Com";
	}
 String name;
 String id;
public Person(String name) {this.name = name;}
}

class Student extends Person{
	String grade;
	String department;
	public Student(String name) {super(name);}	
}