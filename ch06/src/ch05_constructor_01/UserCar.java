package ch05_constructor_01;

public class UserCar {
public static void main(String[] args) {
	/*Car(String model, String color, int maxSpeed){
	this.model = model;
	this.color = color;
	this.maxSpeed = maxSpeed;
	�� �־��� ������ ���� Car(){}�⺻�����ڸ� �߰����� ����.*/
	
	//�����ϵ� Ŭ������ Car()�⺻�����ڰ� ����.
	//ȣ��Ұ��̹Ƿ� ���� �߻�
	//Car car = new Car();
	//�ٸ� ������ - Ŭ������ �ִ� ������ ȣ��.
Car car = new Car("�ҳ�Ÿ","���",200);
	}

}
