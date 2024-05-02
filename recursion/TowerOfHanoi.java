package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		System.out.println("n=" + 2);
		TOH(2, 'A', 'B', 'C');

		System.out.println("n=" + 3);
		TOH(3, 'A', 'B', 'C');
	}

	private static void TOH(int n, char A, char B, char C) {
		if (n == 1) {
			System.out.println("Move " + n + " from " + A + " to " + C);
			return;
		}
		TOH(n - 1, A, C, B);
		System.out.println("Move " + n + " from " + A + " to " + C);
		TOH(n - 1, B, A, C);
	}

}
