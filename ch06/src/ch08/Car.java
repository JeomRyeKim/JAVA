package ch08;

public class Car {
	//�ʵ�
	private int speed;
	private boolean stop;
	
	//������
	//�޼ҵ�
	public int getSpeed() {//get + speed -> ���� ������.
		return speed;
	}
	public void setSpeed(int speed) {//set + Speed -> �� ��������.
		this.speed = speed;//this.�ʵ� = ���ú���
	}	
	
	public boolean isStop() {//boolean�� get��� is�� �����.
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop=stop;
	}
}
