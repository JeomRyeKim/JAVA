package ch03_Map;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueEx {
public static void main(String[] args) {
	Queue<Message> messageQue = new LinkedList<>();
	
	messageQue.offer(new Message("sendMail", "홍길동"));
	messageQue.offer(new Message("sendSNS", "일지매"));
	messageQue.offer(new Message("sendKatok", "임꺽정"));
	
	while(!messageQue.isEmpty()) {
		Message message = messageQue.poll();
		switch (message.command) {
		case "sendMail": System.out.println(message.to + " 메일 전송"); break;
		case "sendSNS": System.out.println(message.to + " SNS 전송"); break;
		case "sendKatok": System.out.println(message.to + " Katok 전송"); break;
		}
	}
	
}
}
