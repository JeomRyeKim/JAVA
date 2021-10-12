package verify;

//*부모생성자 -super*//
public class Ex5 {
	public static void main(String[] args) {
	
	}
}
/* 부모생성자에 default생성자가 없어서 오류 발생*/
class Parent{
	public String name;
	
	//public Parent() {}//1.default생성자 생성
	public Parent(String name) {
       this.name=name;
	}
}
class Child extends Parent{
	private int studentNo;
	//매개변수 2개짜리 생성자
	public Child(String name,int studentNo) {
		super(name);//2.super()메소드 사용하여 부모클래스의 원하는 생성자 호출
		this.name=name;
		this.studentNo=studentNo;
	}
	
}