package ch02_String02;

public class StringSplitEx01 {
	public static void main(String[] args) {
		String str = "홍길동&이수홍,박연수,감자바-최명호";
		//split(구분자)
		String[] names = str.split("&|,|-");
		
		for(String name : names)
			System.out.print(name + " ");

	}

}
