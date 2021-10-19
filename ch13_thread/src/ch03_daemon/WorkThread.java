package ch03_daemon;

public class WorkThread extends Thread{

	public WorkThread(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(getName()+" interrupted");
				break;
			}
		}
		System.out.println(getName()+" Á¾·áµÊ");
	}
}
