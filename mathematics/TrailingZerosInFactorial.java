package mathematics;

public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(countTrailingZerosInFactorial(n));
	}

	private static int countTrailingZerosInFactorial(int n) {
		int trailingZero = 0;
		for (int i = 5; i <= n; i *= 5) {
			trailingZero += (n / i);
		}
		return trailingZero;
	}

}
