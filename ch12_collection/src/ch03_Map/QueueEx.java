package ch03_Map;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
public static void main(String[] args) {
	 Queue<Integer> que = new LinkedList<Integer>();
	 que.offer(1);
	 que.offer(2);
	 que.offer(3);
	 que.offer(4);
	 que.offer(5);
	 
	 System.out.println(que.peek());
	 
	 for(int i=1;i<=5;i++)
		 System.out.println(que.poll());
	 
}
}