package ch03_array;

public class Ex23 {
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
		
		//출력
		for(String s:animal)
			System.out.print(s + " ");
		System.out.println();
			
		
		
	}

}
