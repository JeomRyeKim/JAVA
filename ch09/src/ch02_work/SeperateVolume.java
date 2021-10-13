package ch02_work;

import java.text.DecimalFormat;

public class SeperateVolume implements Lendable{
	//필드
	static final String itemNo="111";// 111-1, 111-2, 111-001, 111-002,... 111-012
	static int seq=0;
	private String requestNo; //도서번호
	private String title; //제목
	private String writer;//저자
	private int state; //도서상태(대여/반납)
	private String name="";//대출자
	private String date="";//대출일자
	
 //인스턴스 초기화 블럭
 {
	seq++;
	DecimalFormat df = new DecimalFormat("000");//전체 세자리 숫자외 비어있는 부분을 "0"으로 채움.
	requestNo = itemNo +"-"+df.format(seq);
 }
	  
public SeperateVolume(String title, String writer) {
	this.title = title;
	this.writer = writer;
}

public SeperateVolume(String requestNo, String title, String writer) {
		this.requestNo = requestNo;
		this.title = title;
		this.writer = writer;
}

		@Override
		public void checkOut(String name, String date) {//대출자,대출일자
		 //도서의 상태가 대출상태면 리턴
	     if(state==BORROWED) {
	    	 System.out.println(title+"는 이미 대출중입니다.");
	    	 return;//
	     }
	     //대출상태가 아니면 대출 진행
	     this.name=name;//대출자명
	     this.date=date;//대출일자
	     state=BORROWED;//대출상태 변경(정상 -> 대출)
	     System.out.println(title+"을 "+name+"가 대출했습니다.");
	     System.out.println("대출일자: "+date);
		}

		//반납
		@Override
		public void checkIn() {
	     name="";//대출자 클리어
	     date="";//대출일자 클리어
	     state=NORMAL;//대출상태 (대출 -> 정상)
	     System.out.println(title+"을 반납했습니다.");
		}

		public int getState() {
			return state;
		}

		public void setState(int state) {
			this.state = state;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public static String getItemno() {
			return itemNo;
		}

		public String getRequestNo() {
			return requestNo;
		}

		public String getTitle() {
			return title;
		}

		public String getWriter() {
			return writer;
		}
		
     //toString()
		@Override
		public String toString() {
			return "SeperateVolume [requestNo=" + requestNo + ", title=" + title + ", writer=" + writer + ", state="
					+ state + ", name=" + name + ", date=" + date + "]";
		}
}
