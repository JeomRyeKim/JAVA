package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
public static void main(String[] args) {
	BufferedReader in = null;
	BufferedWriter out =null;
	Socket socket = null;
	Scanner scanner = new Scanner(System.in);
	try {
		  socket = new Socket("192.168.0.211",9999);//localhost=127.0.0.1 과 동일한 도메인 주소
		//스트림 생성
		 in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		//데이타 주고받기
		while(true) {
			System.out.print("보내기>>");
			String outputMessage = scanner.nextLine();//한줄씩
			if(outputMessage.equalsIgnoreCase("bye")) {
				out.write(outputMessage+"\n");//"bye"문자열 전송
				out.flush();
				break;
			}
			//메세지 보내기
			out.write(outputMessage+"\n");
			out.flush();//밀어내기
			//메세지 받기
			String inputMessage = in.readLine();//
			System.out.println("서버:"+inputMessage);
		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}finally {
		try {
			scanner.close(); if(socket!=null) socket.close();//클라이언트 소켓 닫기
		}catch(Exception e) {
			System.out.println("서버와 채팅 중 오류 발생!!!");
		}
	}
}
}