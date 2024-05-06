package recursion;

public class JosephusProblem {

	public static void main(String[] args) {
		System.out.println(josephus(5, 2));// 3
		System.out.println(josephusIterative(5, 2));// 3
		System.out.println(josephus(7, 3));// 4
		System.out.println(josephusIterative(7, 3));// 4
	}

	private static int josephus(int n, int k) {
		if (n == 1)
			return 1;
		return (josephus(n - 1, k) + k - 1) % n + 1;
	}

	private static int josephusIterative(int n, int k) {
		int res = 0;
		System.out.println("iterative");
		for (int i = 1; i <= n; i++) {
			res = (res + k) % i;
			System.out.print(res + " ");
		}
		return res + 1;
	}

}
