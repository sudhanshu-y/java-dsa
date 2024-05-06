package recursion;

public class LuckyNumber {

	public static void main(String[] args) {
		// counter always starts with two
		System.out.println(isLuckyNumber(13, 2)); // true

		System.out.println(isLuckyNumber(5, 2)); // false

		System.out.println(isLuckyNumber(19, 2)); // true
	}

	private static boolean isLuckyNumber(int n, int counter) {
		if (n % counter == 0)
			return false;
		if (n < counter)
			return true;
		return isLuckyNumber(n - (n / counter), counter + 1);
	}

}
