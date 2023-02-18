package w3d1.assignment3;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("2.50% to 6.75%");
	}

	public static void main(String[] args) {
		AxisBank a= new AxisBank();
		
		a.saving();
		a.fixed();
		a.deposit();
	}

}
