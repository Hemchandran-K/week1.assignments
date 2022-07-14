package week1.assignments;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		boolean prime = false;
		for (int i = 52; i <= n; i++) {
			if (n % i == 0) {
				prime = true;
				break;
			}
		}
		if (prime == true)
			System.out.println("The given number is prime number");
		else
			System.out.println("The given number is not a prime number");
	}

}
