package week1.assignments;

public class Mymobile {

	public void makeCall() {
		int num = 10;
		System.out.println("mobile number");
	}

	public void sendMsg() {
		boolean reached = true;
		System.out.println("reached");
	}

	private void payBills() {
		float num = 27.45f;
		System.out.println(num);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mymobile mob = new Mymobile();
		mob.makeCall();
		mob.sendMsg();
		mob.payBills();
		System.out.println("This is Mymobile");

	}

}
