package stockApplicaiton;

//Ŭ����
public class Stock {
//�ʵ�
 static final String itemNo="111";
 static int seq=0;
 private String item;//��ǰ��ȣ <- ano(���¹�ȣ)
 private String name;//��ǰ��,����� <- owner(������)
 private int qty;//��� <- balance(�ʱ��Աݾ�)
 //�ν��Ͻ� �ʱ�ȭ ��
 {
	seq++;
	String str = String.format("%03d",  seq);
	//String.format : ���ڿ� �������� �����Ѵ�.
	//%:��ɽ���,0:�ڸ����� ���߱����� 0���� ä���,3:�� 3���� �ڸ���,d:������ ����,\n:�ٶ��
	item = itemNo +"-"+str;
	/*seq++;
	 * DecimalFaormat df = new DecimalFormat("000");//��ü ���ڸ� ���ڿ� ����ִ� �κ��� "0"���� ä��.
	 * df.format(seq);
	 * item = StorkNo + "-" + df.format(seq);  */
 }
 //������
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
//Stock ���� ��� �޼ҵ�
@Override
public String toString() {
	return "Stock [��ǰ��ȣ=" + item 
			+ ", ��ǰ��=" + name 
			+ ", ���=" + qty + "]";
}
}