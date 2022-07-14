package week1.assignments;

public class Calculator {
	public void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}

	public void sub(int num1, int num2) {
		System.out.println(num1 - num2);

	}

	public void mul(double num1, double num2) {
		System.out.println(num1 * num2);

	}

	public void div(float num1, float num2) {
		System.out.println(num1 / num2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator opr = new Calculator();
		opr.add(1, 9, 6);
		opr.sub(9, 6);
		opr.mul(569d, 59.36d);
		opr.div(234.7f, 45.98f);
	}

}
