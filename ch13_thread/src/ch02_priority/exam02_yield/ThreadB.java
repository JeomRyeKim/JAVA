package ch02_priority.exam02_yield;

public class ThreadB extends Thread {	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB ÀÛ¾÷ ³»¿ë");
			} else {
				Thread.yield();//½ÇÇà ->´ë±â
			}
		}
		System.out.println("ThreadB Á¾·á");
	}
}
