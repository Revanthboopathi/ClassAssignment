package week5.day5;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("cash deposited in your account");
	}
	public static void main(String[] args) {
		AxisBank details = new AxisBank();
		details.deposit();
	}

}
