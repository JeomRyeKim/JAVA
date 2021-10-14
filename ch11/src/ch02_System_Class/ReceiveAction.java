package ch02_System_Class;

public class ReceiveAction implements Action{

	@Override
	public void execute() {
		System.out.println("메시지 받기");
	}

}
