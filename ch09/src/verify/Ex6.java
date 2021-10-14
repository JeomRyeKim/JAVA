package verify;

public class Ex6 {
	//로컬클래스에서 사용되는 변수는 final의 특성을 가짐.
	void startChat(final String chatId) {
		final String nickName = chatId;
	    //nickName = chatId;
	    //익명객체 생성
	    Chat chat = new Chat() {
	     public void start() {
	    	 while(true) {
	    	String inputData = "안녕하세요";
	    	String message = "[" + nickName + "]" + inputData;
	    	sendMessage(message); 
	    	 }
	     }
	    };
	    chat.start();
}	
	
class Chat{
	void start() {}
	void sendMessage(String message) {}
}
	
	public static void main(String[] args) {}

}