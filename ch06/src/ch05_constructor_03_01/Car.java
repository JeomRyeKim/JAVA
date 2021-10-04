package 
ch05_constructor_03_01;
public class Car {	
	//필드
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){}
	//동일 클래스내에서 다른 생성자 호출시
	//this()메소드로 호출
	//주의사항 - 반드시 호출하는 생성자의 첫 라인에 선언해야함.
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		//Car(model);
		this(model);
		this.color=color;
	}//String,String
		
	Car(String model, String color, int maxSpeed){
		//Car(model,color);
		this(model,color);		
		this.maxSpeed=maxSpeed;
	}//String,String,int

}
