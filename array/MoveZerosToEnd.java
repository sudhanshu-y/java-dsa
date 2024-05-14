package array;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int arr[] = { 8, 5, 0, 10, 0, 20 };
		System.out.println(Arrays.toString(arr));
		moveZerosToEnd(arr);
		System.out.println(Arrays.toString(arr));

		int a[] = { 8, 5, 0, 10, 0, 20 };
		moveZerosToEndSimple(a);
		System.out.println(Arrays.toString(a));

		int arr2[] = { 0, 0, 0, 0, 0, 0, 10, 0, 0 };
		System.out.println(Arrays.toString(arr2));
		moveZerosToEnd(arr2);
		System.out.println(Arrays.toString(arr2));

		int arr3[] = { -1 };
		System.out.println(Arrays.toString(arr3));
		moveZerosToEnd(arr3);
		System.out.println(Arrays.toString(arr3));
	}

	private static void moveZerosToEnd(int[] a) {
		int i = 0, zi = 0;
		while (i < a.length) {
			if (a[zi] == 0 && a[i] == 0) {
				i++;
				continue;
			} else if (a[zi] == 0 && a[i] != 0) {
				swap(a, zi++, i++);
				continue;
			}
			i++;
			zi++;
		}
	}

	private static void swap(int[] a, int zi, int i) {
		int temp = a[zi];
		a[zi] = a[i];
		a[i] = temp;
	}

	// if current element is non-zero ==> increment both index
	private static void moveZerosToEndSimple(int[] a) {
		int zi = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[zi++] = a[i];
			}
		}
		for (int i = zi; i < a.length; i++) {
			a[i] = 0;
		}
	}

}
