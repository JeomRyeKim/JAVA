package verify;

public class Ex9 {
	public static void main(String[] args) {
		System.out.println("다음 코드는 1부터 100까지의 숫지를 통 문자열로 만들기 위해서 += 연산자를 이용해서 100번\r\n"
				+ "반복하고 있습니다. 이것은 곧 100개 이상의 String 객체를 생성하는 결과를 만들기 때문에 좋은 코\r\n"
				+ "드라고 볼 수 없습니다. StringBuilder를 사용해서 좀 더 효율적인 코드로 개선시켜보세요.");
     
		 String str="";
		 for(int i=1;i<=100;i++) str+=i;
		 System.out.println(str);
		 
		 //개선 코드
		 StringBuilder sb = new StringBuilder();
		 for(int i=1;i<=100;i++) sb.append(i);
		 
		 str=sb.toString();
		 System.out.println(str);
		
	}
}