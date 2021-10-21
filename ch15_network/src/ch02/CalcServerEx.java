package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class CalcServerEx {
public static void main(String[] args) {
	//통신에 필요한 객체 선언
	BufferedReader in = null;
	BufferedWriter out = null;
	ServerSocket listener = null;
	Socket socket = null;
	try {
		//접속대기
		listener = new ServerSocket(9999);//(포트번호)
		System.out.println("연결을 기다립니다....");
		//접속
		socket = listener.accept();
		System.out.println("연결되었습니다.");
		//스트림 얻기
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		//서비스
		while(true) {
			String inputMessage = in.readLine();
			if("bye".equalsIgnoreCase(inputMessage)) {
				System.out.println("클라이언트에서 연결을 종료하였습니다.");
				break;//"bye"를 받아서 종료
			}
			//메시지 화면에 뿌리기
			System.out.println(inputMessage);
			//연산처리 
			String res = calc(inputMessage);
			//결과 전송하기
//			out.write(inputMessage + "\n");
			out.write(res + "\n");
			out.flush();
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}finally {//종료할 때 무조건 실행됨.
		try {
			if(socket != null) socket.close();
			if(listener != null) listener.close();
		} catch (Exception e) {
			System.out.println("클라이언트와 채팅 중 오류발생!!!");
		}
	}	
}//메인 메소드()끝
 //연산 처리 메소드
	public static String calc(String exp) {
		//"43 + 30" -> "43","+","30"
		//전달된 메시지로부터 토큰(유효한 값) 분리
		StringTokenizer st = new StringTokenizer(exp," ");//new StringTokenizer(문자열,구분자);
		if(st.countTokens() != 3) return "error";
		String res = "";//연산결과 리턴 객체(문자열) -> Stream -> 클라이언트 문자열로 전달
		int op1 = Integer.parseInt(st.nextToken());//첫번째 토큰 "43"
		String opcode = st.nextToken();//두번째 토큰 "+"
		int op2 = Integer.parseInt(st.nextToken());//세번째 토큰 "30"
		//연산처리
		switch (opcode) {
		case "+": res = Integer.toString(op1 + op2); break;
		case "-": res = Integer.toString(op1 - op2); break;
		case "*": res = Integer.toString(op1 * op2); break;
		default: res = "error";
		}
		return res;
	}
}
