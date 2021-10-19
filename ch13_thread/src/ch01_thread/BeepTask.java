package ch01_thread;

import java.awt.Toolkit;

//1.Runnable인터페이스로 클래스 선언
//Thread클래스는 아니고
//run()메소드를 실행할수 있는 기능을 가진 클래스
public class BeepTask extends Parent implements Runnable{
	@Override
	public void run() {
		//beep음 출력용 객체 생성
		Toolkit toolkit = Toolkit.getDefaultToolkit();//
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try {
				Thread.sleep(500);//0.5초간 정지
			}catch (Exception e) {}
		}
	}
}

class Parent{}