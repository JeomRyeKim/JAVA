package ch11;

public class SeperateVolume implements Lendable{
	String requestNo; String title; String writer;
	  int state; String name="", date="";
	  
	  
	public SeperateVolume(String requestNo, String title, String writer) {
		this.requestNo = requestNo;
		this.title = title;
		this.writer = writer;
	}

		@Override
		public void checkOut(String name, String date) {
	     if(state==BORROWED) return;//
	     this.name=name;
	     this.date=date;
	     state=BORROWED;//대출상태 변경
	     System.out.println(title+"을 "+name+"가 대출했습니다.");
	     System.out.println("대출일자: "+date);
		}

		@Override
		public void checkIn() {
	     name="";
	     date="";
	     state=NORMAL;
	     System.out.println(title+"을 반납했습니다.");
		}	
}