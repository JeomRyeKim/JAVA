package ch01_thread2;

import java.awt.Toolkit;

//��Ƽ������ ��� - main�� �ٸ� Ŭ������ ���ÿ� �����.
//implements Runnable�� ��İ� �Ȱ��� �����.
public class BeepPrintExample2 {
public static void main(String[] args) {
	
	//2.��ӹ��� Ŭ���� �����Ͽ� ����
	Thread thread = new Thread(new Runnable() {

		@Override
		public void run() {
			//beep�� ��¿� ��ü ����
			Toolkit toolkit = Toolkit.getDefaultToolkit();//
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try {
					Thread.sleep(500);//0.5�ʰ� ����
				}catch (Exception e) {}
			}
		}});
	
	//3.������ thread��ü�� run()�޼ҵ� ����
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
