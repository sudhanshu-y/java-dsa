package array;

import java.util.Arrays;

public class MaximumIndex {

	public static void main(String[] args) {
		int arr[] = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
		System.out.println(Arrays.toString(arr) + " : " + getMaximumIndex(arr));
	}

	private static int getMaximumIndex(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (j >= i && arr[j] >= arr[i]) {
					max = Math.max(max, j - i);
				}
			}
		}
		return max;
	}

}
