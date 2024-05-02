package recursion;

public class DigitalRoot {
	// DigitalRoot of a number is the recursive sum of its digits until we get a
	// single digit number.

	public static void main(String[] args) {
		System.out.println(digitalRoot(99998));
	}

	private static int digitalRoot(int n) {
		if (n <= 9) {
			return n;
		}
		int ret = (n % 10) + digitalRoot(n / 10);
		if (ret > 9) {
			ret = digitalRoot(ret);
		}
		return ret;
	}

}
