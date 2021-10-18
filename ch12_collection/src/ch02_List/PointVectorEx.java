package ch02_List;

import java.util.Vector;

public class PointVectorEx {
public static void main(String[] args) {
	//Point객체를 요소로만 가지는 벡터 생성
	Vector<Point> v = new Vector<Point>();
	//3개의 Point객체 저장
	v.add(new Point(2, 3));
	v.add(new Point(-5, 20));
	v.add(new Point(30, -8));
	
	//index(1) 삭제
	v.remove(1);
	
	//출력
	for(int i=0; i<v.size(); i++) {
		Point p=v.get(i);
	System.out.println(p);
	
	
}
}
}

class Point{
	private int x,y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}