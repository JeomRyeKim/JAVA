package ch03_abstract;

public class EmplayeeEx {
public static void main(String[] args) {
	Employee[] emp = new Employee[5];
	emp[0] = new SalaryMan("길동", 50000000);
	emp[1] = new SalaryMan("미재", 2000000);
	emp[2] = new SalaryMan("꺽정", 50000000);
	emp[3] = new HourlyMan("순신", 5, 9500);
	emp[4] = new HourlyMan("관순", 7, 9800);
	
	for(int i=0; i<emp.length; i++) {
		emp[i].computePay();
		emp[i].print();
	}
}
}
