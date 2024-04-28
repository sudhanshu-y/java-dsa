package mathematics;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(71));
		System.out.println(isPrime(9));
	}

	private static boolean isPrime(int n) {
		if (n == 0 || n == 1)
			return false;
		if (n == 2)
			return true;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
