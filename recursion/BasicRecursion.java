package recursion;

public class BasicRecursion {

	public static void main(String[] args) {
		// N^P
		System.out.println(power(2, 10));
		System.out.println(power(3, 3));

		// Print N to 1
		printNto1(5);
		System.out.println();

		// Print N to 1
		print1toN(5);
		System.out.println();

		// Fibonacci term using recursion - 1 1 2 3 5 8
		System.out.println(fibonacci(5)); // 5

		// Sum of natural numbers
		System.out.println(sumOfNNaturalNumbers(100));

		// Check if Palindrom string
		System.out.println(isPalindrom("sdffds", 0, 5));
		System.out.println(isPalindrom("sdf3ds", 0, 4));

		// Sum of digits using recursion
		System.out.println(sumOfDigits(1223));

		// Count digits using recursion
		System.out.println(countDigits(2134));
	}

	private static boolean isPalindrom(String s, int start, int end) {
		if (start >= end)
			return true;
		return (s.charAt(start) == s.charAt(end)) && (isPalindrom(s, start + 1, end - 1));
	}

	private static long power(int n, int p) {
		if (p < 1)
			return 1;
		return n * power(n, p - 1);
	}

	private static void printNto1(int n) {
		if (n < 1)
			return;
		System.out.print(n + " ");
		printNto1(n - 1);
	}

	private static void print1toN(int n) {
		if (n < 1)
			return;
		print1toN(n - 1);
		System.out.print(n + " ");
	}

	private static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	private static long sumOfNNaturalNumbers(int n) {
		if (n == 0)
			return 0;
		return n + sumOfNNaturalNumbers(n - 1);
	}

	private static long sumOfDigits(int n) {
		if (n == 0)
			return 0;
		return (n % 10) + sumOfDigits(n / 10);
	}

	private static long countDigits(int n) {
		if (n == 0)
			return 0;
		return 1 + countDigits(n / 10);
	}
}
