package bitmagic;

public class BitwiseOperator {

	public static void main(String[] args) {
		int x = 2, y = 3;

		System.out.println(x & y); // bitwise and
		System.out.println(x | y); // bitwise or
		System.out.println(x ^ y); // bitwise xor

		System.out.println("Not Operator");
		System.out.println(~5);

		System.out.println("Left Shift Operator");
		System.out.println(x);
		System.out.println(x << 1);
		System.out.println(x << 2);
		System.out.println(x << 3);

		System.out.println(-1 << 1);
		System.out.println(-1 << 2);
		System.out.println(-1 << 3);
		System.out.println(-1 << 4);

		System.out.println("Signed Right Shift Operator");
		// takes care of signed bit
		System.out.println(15);
		System.out.println(15 >> 1);
		System.out.println(15 >> 2);

		System.out.println(-4);
		System.out.println(-4 >> 1);
		System.out.println(-4 >> 2);
		System.out.println(-4 >> 3);
		System.out.println(-4 >> 4);
		System.out.println(-4 >> 5);

		System.out.println("Un-signed Right Shift Operator");
		// always fills leading bit with 0's
		System.out.println(-2 >>> 1);
		System.out.println(-2 >>> 2);
		System.out.println(-2 >>> 3);

		// check number is power of 2 or not --> n*(n-1) = 0 --> Yes
		System.out.println(isPowerOfTwo(64));// 0
		System.out.println(isPowerOfTwo(9));// 8
	}

	private static int isPowerOfTwo(int n) {
		return n & (n - 1);
	}

}
