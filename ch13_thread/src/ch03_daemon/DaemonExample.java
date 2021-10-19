package ch03_daemon;

public class DaemonExample {
public static void main(String[] args) {
	AutoSaveThread autoSaveThread = new AutoSaveThread();
	//start()실행 전에 처리
	autoSaveThread.setDaemon(true);
	//setDaemon(true)후 실행
	autoSaveThread.start();
	
	try {
		Thread.sleep(3000);//3초간 멈춤
	} catch (Exception e) {
	}
	System.out.println("메인 스레드 종료");
}
}
