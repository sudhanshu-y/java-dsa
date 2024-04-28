package mathematics;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println(isPalindrom(123454321));
		System.out.println(isPalindrom(12344321));
		System.out.println(isPalindrom(9012));
	}

	private static boolean isPalindrom(int x) {
		String num = String.valueOf(x);
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
