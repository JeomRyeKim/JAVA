package ch02;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnclickListener listener
	= new Button.OnclickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	public Window() {
		button1.setOnclickListener(listener);
	}
}
