package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalcClientEx {
public static void main(String[] args) {
	//통신에 필요한 객체 선언
	BufferedReader in = null;
	BufferedWriter out = null;
	Socket socket = null;
	Scanner scanner = new Scanner(System.in);
	try {
		//서버와 연결
		socket = new Socket("localhost",9999);//localhost=127.0.0.1 : 내PC와 연결 가능
		//스트림 얻기
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		//서비스 요청
		while(true) {
			System.out.println("계산식(빈칸으로 띄어 입력,예:24 + 42)>>");
			String outputMessage = scanner.nextLine();//키보드에서 수식 읽기
			if("bye".equalsIgnoreCase(outputMessage)) {
				out.write(outputMessage + "\n");//"bye"전송
				out.flush();//데이터 밀어내기
				break;//종료
			}
			//수식전달
			out.write(outputMessage + "\n");
			out.flush();
			//결과 받기
			String inputMessage = in.readLine();//서버로부터 결과를 한 줄씩 수신
			System.out.println("계산 결과:" + inputMessage);
		}
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}finally {
		try {
			scanner.close();
			if(socket != null) socket.close();
		} catch (Exception e) {
			System.out.println("서버와 통신 중 오류발생");
		}
	}	
}
}
