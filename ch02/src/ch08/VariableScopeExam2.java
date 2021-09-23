package ch08;

public class VariableScopeExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main메소드 블럭내에서 선언된 로컬변수
		int var1 = 0;//선언 후 값 초기화
		
		if(true) {
			//main메소드내의 if블럭에서 선언된 로컬변수
			int var2;
			int var3;
			var1 = 1;//값 변경
			//상위 범위의 블럭내에서 선언된 변수를 하위 범위의 블럭에서 선언시 중복선언오류발생
			//int var1;
		}		
		while(true) {
			//main메소드내의 while블럭에서 선언된 로컬변수
			int var3;
			int var2;
			
			break; //반복문을 빠져나가게 하는 명령어
		}		
		System.out.println(var1);
		//System.out.println(var2);
		//System.out.println(var3);
	}

}
