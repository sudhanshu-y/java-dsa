package array;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = { 5, 10, 3, 8, 15, 7 };
		System.out.println(Arrays.toString(arr) + " : " + secondLargestInArray(arr));
	}

	private static int secondLargestInArray(int[] arr) {
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int x : arr) {
			if (x > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = x;
			} else if (x > secondLargest && x != firstLargest) {
				secondLargest = x;
			}
		}
		return secondLargest;
	}

}
