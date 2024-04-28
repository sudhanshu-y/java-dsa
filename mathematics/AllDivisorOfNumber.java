package mathematics;

public class AllDivisorOfNumber {

	public static void main(String[] args) {
		printAllDivisors(273);
		printAllDivisors(500);
	}

	private static void printAllDivisors(int n) {
		if (n < 1)
			return;
		for (int i = 2; i * i < n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
		if (n > 1)
			System.out.print(n);
		System.out.println();
	}

}
