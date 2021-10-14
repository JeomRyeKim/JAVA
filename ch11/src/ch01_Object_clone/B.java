package ch01_Object_clone;

import java.util.Arrays;

public class B implements Cloneable {
 public String name;//참조
 public int age;//기본
 public int[] scores;//참조
 public Car car;//참조
 //생성자
public B(String name, int age, int[] scores, Car car) {
	this.name = name;
	this.age = age;
	this.scores = scores;
	this.car = car;
}
@Override
protected Object clone() throws CloneNotSupportedException {
	B b = (B)super.clone();
	//깊은 복제
//	int[] arr = new int[this.scores.length];
//	for(int i=0; i<this.scores.length; i++)
//		arr[i] = this.scores[i];
//	b.scores = arr;
	
	b.scores = Arrays.copyOf(this.scores, this.scores.length);
	
	//Car 깊은 복제
	b.car = new Car(this.car.model);
	
	b.name = new String(this.name);
	
	return b;
}
public B getB() {
	B cloned = null;
	try {
		cloned = (B)clone();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return cloned;
}
}

class Car{
	String model;//참조

	public Car(String model) {this.model = model;}
	
}