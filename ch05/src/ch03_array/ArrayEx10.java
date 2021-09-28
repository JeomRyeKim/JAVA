package ch03_array;

public class ArrayEx10 {
	public static void main(String[] args) {
		//각 배열의 초기값은 해당 타입의 기본값
		byte[] arrB = new byte [5];
		arrB[0]=0; arrB[1]=0; arrB[2]=0; arrB[3]=0; arrB[4]=0;
		for (int i=0; i<arrB.length; i++) {
			System.out.print(10+arrB[i] + "\t");
		}
		System.out.println();
		char[] charA = new char[5];//charA값이 비어있는 것임.
		for(int i=0; i<charA.length; i++) {
			System.out.print(charA[i] + "\t");
		}
		System.out.println();
		short[] shortA = new short [5];
		for (int i=0; i<shortA.length; i++) {
			System.out.print(shortA[i] + "\t");
		}
		System.out.println();
		int[] intA = new int [5];
		for (int i=0; i<intA.length; i++) {
			System.out.print(10+intA[i] + "\t");
		}
		System.out.println();
		long[] longA = new long [5];
		for (int i=0; i<longA.length; i++) {
			System.out.print(longA[i] + "\t");
		}
		System.out.println();
		System.out.println("실수배열");
		float[] floatA = new float [5];
		for (int i=0; i<floatA.length; i++) {
			System.out.print(floatA[i] + "\t");
		}
		System.out.println();
		double[] doubleA = new double [5];
		for (int i=0; i<doubleA.length; i++) {
			System.out.print(10+doubleA[i] + "\t");
		}
		System.out.println();
		System.out.println("참조배열");
		
		//배열 생성시 해당타입의 초기값으로 초기화됨.
		//기본타입은 0이나 0.0, ' '로 초기화되어서 별도 초기화 작업 없이도 연산문제없음.
		//참조타입은 배열생성시 각 요소의 값이 null로 되어있음.
		//각 요소에 해당하는 객체를 참조하지 않고 있는 것 - null
		//각 요소에 접근시 NullPointerException발생함.
		//null이 아닌 다른 값으로 초기화를 해주어야함.
		String[] stringA = new String [5];
		stringA[0]="a";
		stringA[1]="b";
		stringA[2]="c";
		stringA[3]="d";
		stringA[4]="e";
		
		for (int i=0; i<stringA.length; i++) {
			System.out.print(stringA[i].length() + "\t");
		}
		
	}

}
