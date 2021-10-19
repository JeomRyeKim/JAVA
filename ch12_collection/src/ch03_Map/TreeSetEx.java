package ch03_Map;

import java.util.TreeSet;

public class TreeSetEx {
public static void main(String[] args) {
	TreeSet<Integer> scores = new TreeSet<>();
	scores.add(87);
	scores.add(98);
	scores.add(75);
	scores.add(95);
	scores.add(80);
	
	int score = scores.first();
	System.out.println(score);
	
	score = scores.last();
	System.out.println(score);
	
	score = scores.lower(95);
	System.out.println(score);
	
	score = scores.higher(95);
	System.out.println(score);	
}
}
