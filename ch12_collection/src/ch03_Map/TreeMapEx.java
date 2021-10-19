package ch03_Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
public static void main(String[] args) {
	TreeMap<Integer, String> scores = new TreeMap<>();
	scores.put(87, "홍길동");
	scores.put(98, "일지매");
	scores.put(75, "임꺽정");
	scores.put(95, "이순신");
	scores.put(80, "김길동");
	
	//맵 entry단위 추출 Map.Entry<키,값>
	Map.Entry<Integer, String> entry = null;
	
	entry = scores.firstEntry();
	System.out.println("가장 낮은 점수: " + entry.getKey() + " - " + entry.getValue());
	
	entry = scores.lastEntry();
	System.out.println("가장 높은 점수: " + entry.getKey() + " - " + entry.getValue());
	
	entry = scores.higherEntry(95);
	System.out.println("95점 위의 점수: " + entry.getKey() + " - " + entry.getValue());
	
	entry = scores.ceilingEntry(85);
	System.out.println("85점이거나 바로 위의 점수: " + entry.getKey() + " - " + entry.getValue());
	
	entry = scores.lowerEntry(95);
	System.out.println("95점 아래의 점수: " + entry.getKey() + " - " + entry.getValue());
	
	entry = scores.floorEntry(85);
	System.out.println("85점이거나 바로 아래의 점수: " + entry.getKey() + " - " + entry.getValue());
}
}
