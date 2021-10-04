package 
ch05_constructor_03;
public class Car {	
	//생성자
	//signature(시그니처)-선언부가 다르면 다른 생성자로 인식(jvm)
	//매개변수의 타입,개수,순서가 다르면 다른 생성자
	Car(){}
	Car(String model){}
	Car(String model, String color){}//String,String
	//Car(String color, String model){} - 오버로딩 아님 String,String
	Car(String modle, String color, int maxSpeed){}//String,String,int
	Car(int maxSpeed, String modle, String color){}//int,String,String
	
	String str = new String("홍길동");
}
