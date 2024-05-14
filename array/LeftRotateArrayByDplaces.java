package array;

import java.util.Arrays;

public class LeftRotateArrayByDplaces {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(arr));
		leftRotateArrayByDplaces(arr, 2);
		System.out.println(Arrays.toString(arr));

	}

	private static void leftRotateArrayByDplaces(int[] arr, int d) {
		int n = arr.length;
		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, n - 1);
		reverseArray(arr, 0, n - 1);
	}

	private static void reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			swap(arr, start++, end--);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
