package ch01_If_02;

public class RandomNumberExam {
	public static void main(String[] args) {
		// 0 <= Mate.random()출력범위 < 1	위 난수 출력
		// 0*10 <= Mate.random()*10 < 1*10
		// 0 <= Mate.random()*10 < 10
		// int(0.0) <= (int)(Mate.random()*10) < (int)10
		
		double ran = (int)(Math.random()*10);// 0.0 <= 범위 < 10.0
		System.out.println(ran);
		
		//자연수 범위의 난수 출력시
		//(int)(Mate.random()*범위)+1
		int ranI = (int)(Math.random()*10)+1;// 0+1 <= 범위+1 < 10+1 : 0~9 => 1~10
		System.out.println(ranI);

	}

}
