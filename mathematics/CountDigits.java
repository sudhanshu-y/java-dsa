package mathematics;

public class CountDigits {

	public static void main(String[] args) {
		System.out.println(countDigits(233445));
	}

	private static int countDigits(int x) {
		if (x == 0)
			return 1;
		return (int) Math.log10(Math.abs(x)) + 1;
	}

}
