package 
ch05_constructor_03_02;
public class Car {	
	//필드
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){System.out.println("default생성자가 제일 먼저 실행되지?");}
	Car(String model){
		this();//default생성자 호출
		this.model = model;
		System.out.println("그 다음 실행되지?");
	}
	Car(String model, String color){
		this(model);
		this.color=color;
		System.out.println("매개변수 두개짜리 실행되지?");
	}
		
	Car(String model, String color, int maxSpeed){
		this(model,color);		
		this.maxSpeed=maxSpeed;
		System.out.println("매개변수 세개짜리 실행되지?");
	}

}
;