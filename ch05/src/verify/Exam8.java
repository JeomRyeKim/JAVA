package verify;
//8. �־��� �迭�� ��ü �׸��� �հ� ��հ��� ���غ����� (��ø for)
public class Exam8 {
	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}};
		int sum = 0;
		double avg = 0.0;
		int len = 0;
		int cnt = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
			//2.len += array[i].length;
		}
		avg = sum/(double)cnt;
		//2.avg = sum / (double)len;
		//1.avg = sum /(double)(array[0].length+array[1].length+array[2].length);
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}