package ch01_thread2;

//멀티쓰레드 방식 - main과 다른 클래스가 동시에 진행됨.
//implements Runnable한 방식과 똑같이 진행됨.
public class BeepPrintExample {
public static void main(String[] args) {
	
	//상속받은 클래스 생성하여 실행
	Thread thread = new BeepTask();
	
	//4.생성된 thread객체의 run()메소드 실행
	//thread.run(); //직접호출 <- 이렇게 하지 않음.
	thread.start();
	
	//main스레드에서 실행되는 부분
	for(int i=0; i<5; i++) {
		System.out.println("띵");
		try {
			Thread.sleep(500);//0.5초간 정지
		}catch (Exception e) {}
	}
	
}
}
