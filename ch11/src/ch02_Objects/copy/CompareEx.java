package ch02_Objects.copy;

import java.util.Objects;

public class CompareEx {
public static void main(String[] args) {
	Student s1 = new Student("È«±æµ¿");
	Student s2 = new Student("È«±æµ¿");
	Student s3 = new Student("È«±æÀÌ");
	
	int result = Objects.compare(s1, s2, new StudentComparator());
	System.out.println(result);
	
	result = Objects.compare(s1, s3, new StudentComparator());
	System.out.println(result);
}
}
