package array;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 4, 6 };
		int arr2[] = { 2, 5, 7, 8 };

		int arr3[] = mergeTwoSortedArrays(arr1, arr2);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

	// Time Complexity : O(m+n)
	private static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
		int n1 = arr1.length, n2 = arr2.length;
		int arr[] = new int[n1 + n2];
		int start1 = 0, start2 = 0, i = 0;
		while (start1 < n1 || start2 < n2) {
			if (start1 >= n1 && start2 < n2) {
				arr[i++] = arr2[start2++];
			} else if (start1 < n1 && start2 >= n2) {
				arr[i++] = arr1[start1++];
			} else if (arr1[start1] < arr2[start2]) {
				arr[i++] = arr1[start1++];
			} else if (arr1[start1] > arr2[start2]) {
				arr[i++] = arr2[start2++];
			}
		}
		return arr;
	}

}
