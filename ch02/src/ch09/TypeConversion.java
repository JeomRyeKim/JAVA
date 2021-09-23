package ch09;

public class TypeConversion {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;

		System.out.println(b+i);// 127(byte) + 100(int) => 127(int) + 100(int) = 227 결과의 타입은? int
		System.out.println(10/4); // 정수/정수 -> 정수
		System.out.println(10.0/4);// 정수/실수 -> 실수
		System.out.println((char)0x12340041);// A
		System.out.println((byte)(b+i));//오버플로우-byte범위가 127을 넘어서면 -128 -> -127 -> -126..이런식으로 나옴
		System.out.println((int)2.9 + 1.8);// 2 + 1.8 => 2.0 + 1.8 = 3.8
		System.out.println((int)(2.9 + 1.8));// 4.7 => 4
		System.out.println((int)2.9 + (int)1.8);// 2 + 1 = 3


	}

}
