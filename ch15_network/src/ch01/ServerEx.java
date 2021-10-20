package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out =null;
		ServerSocket listener =null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			//서버 소켓 생성 172.30.1.28, 9999
			listener = new ServerSocket(9999);//
			System.out.println("연결을 기다리고 있습니다....");
			socket =listener.accept(); 
			System.out.println("연결되었습니다.");
			//통신 진행
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//데이타 주고받기
			while(true) {
				String inputMessage = in.readLine();//클라이언트로 부터 한 행씩 읽기
				//종료 조건
				if(inputMessage.equalsIgnoreCase("bye")) {//Bye, bYe, bYE, BYE
					System.out.println("클라이언트로 부터 bye로 연결을 종료합니다.");
					break;//연결 종료
				}
				System.out.println("클라이언트:"+inputMessage);//클라이언트로 부터 온 메세지 출력
				System.out.print("보내기>>");
				String outputMessage = scanner.nextLine();//키보드로 부터 한 행씩 보내기
				out.write(outputMessage+"\n");//한 줄씩 받도록 전달
				out.flush();//버퍼에 남아있는 데이타 밀어내기
			}
		}catch(Exception e) {
			
		}finally {
			try {
				scanner.close(); socket.close(); listener.close();
			}catch(Exception e) {
				System.out.println("클라이언트와 채팅 중 오류 발생");
			}
		}
		
		
	}

}