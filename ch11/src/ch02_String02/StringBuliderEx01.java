package ch02_String02;

public class StringBuliderEx01 {
	public static void main(String[] args) {
		//
		StringBuilder sb = new StringBuilder();
		//문자열 이어붙이기 append()
		sb.append("java ");
		sb.append("Programmaing study");
		//
		System.out.println(sb);//toString()내용출력
		
		//삽입 insert(index,문자열)
		sb.insert(4, "2");
		System.out.println(sb);//toString()내용출력
		//setCharAt(index,바꿀문자)
		sb.setCharAt(4, '6');
		System.err.println(sb);//toString()내용출력
		
		//replace (시작index,끝index,바꿀문자열); 시작index(포함) <= 범위 < 끝index(불포함)
		sb.replace(6, 13, "Book");
		System.err.println(sb);//toString()내용출력
		
		//delete(시작index,끝index); 시작index(포함) <= 범위 < 끝index(불포함)
		sb.delete(4, 5);
		System.err.println(sb);//toString()내용출력
		
		int length = sb.length();
		System.out.println("총 문자수:" + length);
		
		//
		String result = sb.toString();//버퍼내용 추출
		System.out.println(result);

	}

}
