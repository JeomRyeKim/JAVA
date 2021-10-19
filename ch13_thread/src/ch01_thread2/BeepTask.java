package ch01_thread2;

import java.awt.Toolkit;

//1.Thread클래스를 직접 상속받아서 생성
public class BeepTask extends Thread{
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
