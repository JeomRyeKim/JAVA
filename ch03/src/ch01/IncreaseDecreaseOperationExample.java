package ch01;

public class IncreaseDecreaseOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 단항 연산자 - 증감, ++, -- */
		int x = 10;
		int y = 10;
		int z;
		
		//단독 연산이 아닌 다른 연산과 함께 실행되는 경우
		z=x++;
		System.out.println(z);// 10
		System.out.println(x);// 11
		//현재 x=11, z=10;
		
		z=++x;
		System.out.println(z);// 12
		System.out.println(x);// 12
		
		z=y--;// y=10, x=12;
		System.out.println(z);// 10
		System.out.println(y);// 9
		
		z=--y;// y=9, x=10;
		System.out.println(z);// 8
		System.out.println(y);// 8
		
		int family = 50;
		family++;//51
		++family;//52
		System.out.println("우리집의 식구는 모두 "+((family++)+1)+"명이다");
		// 53
		System.out.println(family);//53
		
	}

}
