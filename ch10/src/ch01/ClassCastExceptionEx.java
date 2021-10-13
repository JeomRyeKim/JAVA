package ch01;

public class ClassCastExceptionEx {
	public static void main(String[] args) {
		try {
		Animal animal = new Cat();
		Cat cat = null;
		System.out.println(cat.toString());
		//예외 처리 안 한 예외 발생으로 밑의 예외도 발생X - 바로 프로그램 종료
		Dog dog = (Dog)animal;//예외 발생 - 프로그램이 종료가 됨.
		//예외 발생시 아래 명령문 실행 안 함
		System.out.println("형변환 처리");
		}catch (ClassCastException e) {
			System.out.println("고양이는 개가 될 수 없습니다.");
		}finally { // 이건 무조건 실행하고 넘어가야 한다.(항상 실행됨)
			//명령문 실행
			System.out.println("프로그램 종료");
		}

	}

}
