package ch02_priority.exam02_yield;

public class ThreadA extends Thread {	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA ÀÛ¾÷ ³»¿ë");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA Á¾·á");
	}
}