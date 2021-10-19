
public class ThreadNameExample {
public static void main(String[] args) {
	//현재 실행중인 쓰레드 얻기
	Thread mainThread = Thread.currentThread();//현재 실행중인 쓰레드
	System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());//이름 출력
	
	//쓰레드 객체생성
	Thread threadA = new ThreadA();
	System.out.println("작업 쓰레드 이름: " + threadA.getName());
	threadA.start();
	
	Thread threadB = new ThreadB();
	System.out.println("작업 쓰레드 이름: " + threadB.getName());
	threadB.start();
	
	
}
}

class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");//쓰레드 이름으로 쓰레드객체 생성
	}

	@Override
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");//getName()
		}
	}
}

class ThreadB extends Thread{
	public ThreadB() {
		setName("ThreadB");
	}

	@Override
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}