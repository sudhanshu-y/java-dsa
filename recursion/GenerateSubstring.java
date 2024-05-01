package recursion;

public class GenerateSubstring {

	public static void main(String[] args) {
		generateSubstringRecursive("abc", "", 0);
	}

	private static void generateSubstringRecursive(String str, String curStr, int i) {
		if (i == str.length()) {
			System.out.println(curStr);
			return;
		}
		// do not include character
		generateSubstringRecursive(str, curStr, i + 1);
		// include character
		generateSubstringRecursive(str, curStr + str.charAt(i), i + 1);
	}

}
