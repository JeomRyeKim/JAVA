package stockApplicaiton;

//클래스

 

public class Stock {

	//필드

 static final String itemNo="111";

 static int seq=0;

 private String item;

 private String name;

 private int qty;

 

 {

	seq++;

	String str = String.format("%03d%n",  seq);

	item = itemNo +"-"+str;

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