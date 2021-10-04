package ch03;

public class A {
 int a;
 
/* 필드명과 로컬변수명이 하나의 블럭내에서 같이 사용될 때구분하기 위해 this.로 구분함. */
 A(int a) {
	 this.a = a;//this.a(필드) = a(로컬);
 }
 void method(int a) {}
}
