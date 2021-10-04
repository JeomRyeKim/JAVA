package ch03;

public class Person {
	//필드
	String name;//고유속성
	int year;//고유속성
	int age;//현재상태
	
	//생성자
	Person(String name, int year) {
		this.name=name;
		this.year=year;
	}
	
	//메소드
	void personInfo() {
		age = 2021 - year;
		System.out.println(name + "," + age + "");
	}
}
