package ch03_array;

public class Ex24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//참조타입(String) 1차원 배열 선언
		String[] snake= {"구렁이","팔렁이","칠렁이","육렁이","오렁이"};
		String[] insect= {"메뚜기","개미","지렁이"};
		//참조타입의 배열의 각 요소의 초기값은 기본값인 null로 되어있음.
		//두 배열 합치기 [null][null][null][null][null][null][null][null][null]
		String[] animal = new String[snake.length + insect.length+1];
		
		//합치기
		for(int i=0; i<snake.length; i++) {animal[i]=snake[i];}
		for(int i=0; i<insect.length; i++) {animal[snake.length+i]=insect[i];}	
		
		//참조객체를 저장하고있는 배열은 각 index에 해당하는 곳에 객체의 주소번지를 저장
		//각 요소 복사시 index번호에 저장된 요소의 주소값이 복사됨.
		System.out.println(snake[0] == animal[0] ? "동일객체 참조" : "다른 객체 참조");
		
		System.out.println(snake[0].hashCode());
		System.out.println(animal[0].hashCode());
		//위 아래 방식으로 둘 다 가능함.
		String str = snake[0];
		System.out.println(str.hashCode());		
		
		//출력
		for(String s:animal)
			System.out.print(s + " ");
		System.out.println();
			
		
		
	}

}
