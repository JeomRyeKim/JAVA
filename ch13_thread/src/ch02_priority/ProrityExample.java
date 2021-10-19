package ch02_priority;

//쓰레드의 우선순위 - 생성시 5, 1이면 가장 낮은 우선순위, 10이면 가장 높은 우선순위
public class ProrityExample {
public static void main(String[] args) {
	for(int i=0; i<=10; i++) {
		Thread thread = new CalcThread("thread" + i);
		System.out.println("생성시 쓰레드 우선순위:" + thread.getPriority());
		if(i != 10) {
			thread.setPriority(Thread.MIN_PRIORITY);//우선순위 변경
		}else {
			thread.setPriority(Thread.MAX_PRIORITY);//우선순위 변경
		}
		thread.start();//쓰레드 실행
		System.out.println("쓰레드 우선순위:" + thread.getPriority());
	}
}
}
