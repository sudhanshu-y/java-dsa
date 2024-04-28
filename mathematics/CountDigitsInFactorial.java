package mathematics;

public class CountDigitsInFactorial {

	public static void main(String[] args) {
		// digits in 5!
		System.out.println(countDigitsInFactorial(5));

		// digits in 120!
		System.out.println(countDigitsInFactorial(120));
	}

	private static int countDigitsInFactorial(int n) {
		if (n < 1)
			return 1;
		double numDigits = 0; // must be double not int
		for (int i = 2; i <= n; i++) {
			numDigits += Math.log10(i);
		}
		return (int) Math.floor(numDigits) + 1;
	}

}
