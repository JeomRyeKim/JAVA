package ch01_thread2;

//��Ƽ������ ��� - main�� �ٸ� Ŭ������ ���ÿ� �����.
//implements Runnable�� ��İ� �Ȱ��� �����.
public class BeepPrintExample {
public static void main(String[] args) {
	
	//��ӹ��� Ŭ���� �����Ͽ� ����
	Thread thread = new BeepTask();
	
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
