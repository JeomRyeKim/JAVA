package stockApplicaiton;

//클래스
public class Stock {
//필드
 static final String itemNo="111";
 static int seq=0;
 private String item;//상품번호 <- ano(계좌번호)
 private String name;//상품명,재고목록 <- owner(계좌주)
 private int qty;//재고량 <- balance(초기입금액)
 //인스턴스 초기화 블럭
 {
	seq++;
	String str = String.format("%03d",  seq);
	//String.format : 문자열 형식으로 지정한다.
	//%:명령시작,0:자릿수를 맞추기위해 0으로 채운다,3:총 3개의 자릿수,d:십진수 정수,\n:줄띄움
	item = itemNo +"-"+str;
	/*seq++;
	 * DecimalFaormat df = new DecimalFormat("000");//전체 세자리 숫자외 비어있는 부분을 "0"으로 채움.
	 * df.format(seq);
	 * item = StorkNo + "-" + df.format(seq);  */
 }
 //생성자
public Stock(String name, int qty) {
	this.name = name;
	this.qty = qty;
}
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
//Stock 정보 출력 메소드
@Override
public String toString() {
	return "Stock [상품번호=" + item 
			+ ", 상품명=" + name 
			+ ", 재고=" + qty + "]";
}
}