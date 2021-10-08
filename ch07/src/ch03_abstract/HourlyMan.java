package ch03_abstract;

public class HourlyMan extends Employee {
	//필드
	int workHour, moneyPerHour;
	//생성자
	public HourlyMan(String name, int workHour, int moneyPerHour) {
		super(name);
		this.workHour = workHour;
		this.moneyPerHour = moneyPerHour;
	}
	@Override
	int computePay() {
		return workHour * moneyPerHour;
	}
	
	
	

}