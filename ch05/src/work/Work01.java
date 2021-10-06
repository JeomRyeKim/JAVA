package work;

import java.util.Scanner;

/*���� ������� 10/4��(��) 23:59�� ����
 * ��ĳ�ʷ� �Է°� �Է¹ޱ� ����, ����, Ű, ������
 * �ݺ�ó�� �����ϰ� ����� 
 * ��� ���� ����� yes/no���� �޾Ƽ� �����ϵ��� �����ϱ�.
 * https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=kmovie97&logNo=150186681215
 * */
public class Work01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		double maleSTD = 1.10, femaleSTD = 1.07;
		int COMSTD = 128, COMSTD2 = 100;
		
		while(run) {
		System.out.println("���ڸ� W, ���ڸ� M�� �Է��ϼ���: ");
		String gender = scanner.next();
		System.out.println("10��~39�� ���� ���̸� �Է��ϼ���: ");
		int age = scanner.nextInt();
		System.out.println("Ű�� �Է��ϼ���(����:cm): ");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���(����:kg): ");
		double weight = scanner.nextDouble();
		
		//ü���淮 ���ϱ�
		//���� = (1.10 * ü��) - (128 * (ü��*ü��)/(Ű*Ű))
		//���� = (1.07 * ü��) - (128 * (ü��*ü��)/(Ű*Ű))
		double leanBodyMass = 0.0;
		switch (gender) {
		case "M":
			leanBodyMass = (maleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
			break;
		case "F":
			leanBodyMass = (femaleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
			break;
		}
		System.out.println("���: ");
		System.out.println("ü���淮:%.2f\n" + leanBodyMass);
		
		System.out.println("����ұ��?(yes or no): ");
		String yon = scanner.next();
		if(yon.equals("no")) run = !run;
		}

		//ü���淮(=ü��-�����淮) ���ϱ�
		double bodyFatMass = 0.0;
		bodyFatMass = weight - leanBodyMass;

		//ü�����(=�����淮*100)/ü��
		double leanBodyRatio = (leanBodyMass * 100) / (double) weight;

		//ü�����(=ü���淮*100/ü��)
		double bodyFatRatio = (bodyFatMass * 100) / (double) weight;


		System.out.println("���:>");
		System.out.printf("�������:%.2f\n", leanBodyRatio);
		System.out.printf("ü���淮:%.2f\n", bodyFatMass);
		System.out.printf("ü�����:%.2f\n", bodyFatRatio);


		String result = "";
		//��/�� �� �񸸵� ����
		switch (gender) {
		case "M":
			if (bodyFatRatio < 12)
				result = "���� ��";
			else if (bodyFatRatio <= 17)
				result = "ǥ��";
			else if (bodyFatRatio <= 22)
				result = "��ü��";
			else if (bodyFatRatio <= 27)
				result = "��";
			else
				result = "����";

			break;
		case "F":
			if (bodyFatRatio < 22)
				result = "���� ��";
			else if (bodyFatRatio <= 27)
				result = "ǥ��";
			else if (bodyFatRatio <= 35)
				result = "��ü��";
			else if (bodyFatRatio <= 40)
				result = "��";
			else
				result = "����";
			break;
		}// switch�� ��.
		
		System.out.println("���:>");
		System.out.println(result);
	}
}