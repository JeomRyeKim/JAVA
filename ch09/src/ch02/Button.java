package ch02;

public class Button {
//�ʵ� - ���
	OnclickListener listener;
 	
	public void setOnclickListener(OnclickListener listener) {
		this.listener = listener;
	}
	
	//
	void touch() {
		listener.onClick();
	}
	
//�����������̽� - ����
interface OnclickListener{
	void onClick();
}

}
