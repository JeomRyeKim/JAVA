package ch03_daemon;

//일반 쓰레드
public class AutoSaveThread extends Thread{
 public void save() {
	 System.out.println("작업 내용을 저장함");
 }

@Override
public void run() {
	while(true) {
		try {
			Thread.sleep(1000);//1초 대기
		} catch (InterruptedException e) {
			break;
		}
		save();//1분 간격으로 자료 저장
	}
}
}
