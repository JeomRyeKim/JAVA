package ch02;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(new Student("홍길동",90,96),new Student("일지매",95,93));
	
	public static double avg(ToIntFunction<Student> function) {
		int sum=0;
		for(Student student:list) {
			sum+=function.applyAsInt(student);
		}
		double avg = (double)sum/list.size();
		return avg;
		
	}
public static void main(String[] args) {
	double englishAvg = avg(new ToIntFunction<Student>() {
		@Override
		public int applyAsInt(Student value) {
			return value.getEnglishScore();
		}
	});
	System.out.println(englishAvg);
	//람다식
	englishAvg = avg(value -> value.getEnglishScore());
	System.out.println(englishAvg);
}
}
