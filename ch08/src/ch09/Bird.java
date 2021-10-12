package ch09;

//자바는 클래스와 인터페이스를 부모로
//클래스 다중 상속을 대신할 수 있다
public class Bird extends Animal implements RunInterface{

	@Override
	public void run() {}
	//name
	//eat()
}

//run() <- Bird에 적용
