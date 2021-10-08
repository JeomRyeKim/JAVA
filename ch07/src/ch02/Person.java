package ch02;

public class Person {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
	private int weight;//private멤버 접근 - public 메소드로 접근
	 		 int age;
	 protected int height;
	 public String name;
	 //메소드
	public int getWeight() {return weight;}
	public void setWeight(int weight) {this.weight = weight;}
	}
class Student extends Person {
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		//weight = 99; - private때문에 접근불가
		setWeight(99);//우회해서 접근가능
	}
}
