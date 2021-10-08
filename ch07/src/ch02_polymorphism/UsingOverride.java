package ch02_polymorphism;

public class UsingOverride {
	public static void main(String[] args) {
		Shape start, last, obj;
		//링크드 리스트 형태[][][][][]
		start = new Line();
		last = start;
		obj = new Rect();
		last.next = obj;
		last=obj;
		obj=new Line();
		last.next=obj;
		last=obj;
		obj=new Circle();
		last.next=obj;
		//Circle()객체의 next는 null
		//모든 도형 출력
		Shape p=start;
		while(p!=null) {
			p.draw();
			p=p.next;
		}

	}

}
