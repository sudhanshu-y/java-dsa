package array;

import java.util.Arrays;

public class IsArraySortedAndRotated {

	// get index of minimum element
	// make two arrays left & right
	// check if both left and right arrays are sorted

	public static void main(String[] args) {
		int arr1[] = { 3, 4, 1, 2 };
		int arr2[] = { 1, 2, 3 };
		System.out.println(Arrays.toString(arr1) + " : checkRotatedAndSorted: " + checkRotatedAndSorted(arr1));
		System.out.println(Arrays.toString(arr2) + " : checkRotatedAndSorted: " + checkRotatedAndSorted(arr2));
	}

	public static boolean checkRotatedAndSorted(int arr[]) {
		int minIndex = getMinIndex(arr);
		if (minIndex == 0 || minIndex == arr.length) {
			return false;
		}
		boolean leftSorted = isArraySorted(arr, 0, minIndex);
		boolean rightSorted = isArraySorted(arr, minIndex, arr.length);
		return leftSorted & rightSorted;
	}

	public static int getMinIndex(int arr[]) {
		int minIdx = 0, min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				minIdx = i;
			}
		}
		return minIdx;
	}

	public static boolean isArraySorted(int arr[], int start, int end) {
		boolean sorted = true;
		boolean reverseSorted = true;
		for (int i = start; i < end - 1 && (sorted | reverseSorted); i++) {
			sorted = sorted & (arr[i] <= arr[i + 1]);
			reverseSorted = reverseSorted & (arr[i] >= arr[i + 1]);
		}
		return (sorted | reverseSorted);
	}
}
