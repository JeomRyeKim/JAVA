package ch02_01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", "남자", 90),
			new Student("일지매", "여자", 90),
			new Student("임꺽정", "남자", 95),
			new Student("이순신", "여자", 92)
			);
	
	//집계 메소드
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student:list) {
			if(predicate.test(student)) {
				count++;
				sum+=student.getScore();
			}
		}
		return (double)sum/count;
	}
	
public static void main(String[] args) {
	//남자 평균
	double avgMale = avg(new Predicate<Student>() {
		@Override
		public boolean test(Student t) {
			return "남자".equals(t.getGender());
		}
	});
	System.out.println("남자평균: " + avgMale);
	//람다식
	avgMale = avg(t -> "남자".equals(t.getGender()));
	System.out.println("남자평균: " + avgMale);
	
	//여자 평균 - 람다식
	double avgFemale = avg(t -> t.getGender().equals("여자"));
	System.out.println("여자평균: " + avgFemale);
}
}
