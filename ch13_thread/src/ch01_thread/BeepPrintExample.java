package ch01_thread;

//��Ƽ������ ��� - main�� �ٸ� Ŭ������ ���ÿ� �����.
public class BeepPrintExample {
public static void main(String[] args) {
	//2.Runnable �������̽� ��ü ���� - beep���� ����� ���ÿ� ��.
	Runnable beepTask = new BeepTask(); 
	//3.Thread�� �����ڷ� �����Ͽ� Thread��ü ����
	Thread thread = new Thread(beepTask);
	
	//4.������ thread��ü�� run()�޼ҵ� ����
	//thread.run(); //����ȣ�� <- �̷��� ���� ����.
	thread.start();
	
	//main�����忡�� ����Ǵ� �κ�
	for(int i=0; i<5; i++) {
		System.out.println("��");
		try {
			Thread.sleep(500);//0.5�ʰ� ����
		}catch (Exception e) {}
	}
	
}
}
