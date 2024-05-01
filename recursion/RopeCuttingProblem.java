package recursion;

public class RopeCuttingProblem {

	public static void main(String[] args) {
		int n = 23, a = 11, b = 9, c = 12;
		System.out.println(maxCuts(n, a, b, c));
		System.out.println(maxCuts(17, 10, 11, 3));
		System.out.println(maxCuts(9, 2, 2, 2));
	}

	private static int maxCuts(int n, int a, int b, int c) {
		if (n == 0)
			return 0;
		if (n < 0)
			return -1;
		int result = Math.max(maxCuts(n - a, a, b, c), Math.max(maxCuts(n - b, a, b, c), maxCuts(n - c, a, b, c)));
		if (result < 0)
			return -1;
		return result + 1;
	}

}
