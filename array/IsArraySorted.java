package array;

import java.util.Arrays;

public class IsArraySorted {

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 5, 7, 8, 9 };
		int arr2[] = { 6, 4, 3, 2, 1 };
		int arr3[] = { 6, 4, 3, 2, 1, 9, 0 };
		System.out.println(Arrays.toString(arr1) + " : isSorted: " + isSorted(arr1));
		System.out.println(Arrays.toString(arr2) + " : isSorted: " + isSorted(arr2));
		System.out.println(Arrays.toString(arr3) + " : isSorted: " + isSorted(arr3));
	}

	private static boolean isSorted(int[] arr) {
		boolean sorted = true, reverseSorted = true;
		for (int i = 0; i < arr.length - 1 && (sorted | reverseSorted); i++) {
			sorted = sorted & (arr[i] <= arr[i + 1]);
			reverseSorted = reverseSorted & (arr[i] >= arr[i + 1]);
		}
		return sorted | reverseSorted;
	}

}
