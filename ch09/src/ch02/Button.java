package ch02;

public class Button {
//필드 - 사용
	OnclickListener listener;
 	
	public void setOnclickListener(OnclickListener listener) {
		this.listener = listener;
	}
	
	//
	void touch() {
		listener.onClick();
	}
	
//내부인터페이스 - 선언
interface OnclickListener{
	void onClick();
}

}
