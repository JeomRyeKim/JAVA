package ch02;

public class CompareExample3 {
	public static void main(String[] args) {
		//비교연산
		System.out.println('a'>'b');//ascii값 비교 97>98 - F
		System.out.println(3>=2);//T
		System.out.println(-1<0);//T
		System.out.println(3.45<=2);//F
		System.out.println(3==2);//F
		System.out.println(3!=2);//T
		System.out.println(!(3!=2));//F
		
		
		System.out.println((3>2)&&(3>4));//F
		System.out.println((3!=2)||(-1>0));//T
		System.out.println((3!=2)^(-1>0));//T
		}

	}


