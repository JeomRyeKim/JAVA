package ch03_Map;

public class Message {
public String command;//명령
public String to;//수신자
//생성자
public Message(String command, String to) {
	this.command = command;
	this.to = to;
}


}
