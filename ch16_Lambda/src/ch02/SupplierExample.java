package ch02;

import java.util.function.IntSupplier;

//supplier유형
public class SupplierExample {
public static void main(String[] args) {
	IntSupplier intSupplier = new IntSupplier() {
		@Override
		public int getAsInt() {
			int num = (int)(Math.random()*6)+1;//1~6 정수 랜덤 추출
			return num;
		}
	};
	System.out.println(intSupplier.getAsInt());
	
	//람다식
	intSupplier = () -> (int)(Math.random()*6)+1;
	System.out.println(intSupplier.getAsInt());
}
}
