package ch01;

/**
 * 모든 연산시 String타입과 연산할 때는
 * 	다른 데이터 타입은 무조건 String타입으로 자동 형변환 후에 연산에 참가함.
 * */
public class OperExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "JDK" + 6.0;// +는 결합(concat)연산, "JDK" + "6.0" => "JDK6.0";
		String str2 = str1 + "특징";//"JDK6.0" + "특징" -> "JDK6.0특징"
		System.out.println(str2);
		
		String str3 ="JDK" + 3 + 3.0;
		//"JDK" + 3 -> "JDK + "3" = "JDK3", "JDK3"+3.0="JDK3"+"3.0"="JDK33.0";
		String str4 = 3 + 3.0 + "JDK";
		//3+3.0 => 6.0, 6.0+"JDK" => "6.0" + "JDK" = "6.0JDK";
		System.out.println(str3);
		System.out.println(str4);
	}

}
