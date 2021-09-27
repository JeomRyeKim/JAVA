package ch03_for;

public class ForExam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(초기화;for블럭을 빠져나가는 조건;증감){실행문;}
	for(int i=1; true ;i++) {//for 블럭을 빠져나가는 조건이 없는 경우, 조건을 true로 간주. - 무한반복
		System.out.println(i + "hello");
		//for블럭을 빠져나가나는 조건을 블럭내에서 처리{}
		if(i==10) break;//블럭을 빠져나가는 명령문 break;
	}
		System.out.println("종료");
	}

}
