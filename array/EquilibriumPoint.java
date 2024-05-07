package array;

import java.util.Arrays;

public class EquilibriumPoint {

	// EquilibriumPoint: LHS = RHS
	// Total = LHS + arr[i] + RHS[i]
	// RHS[i] = Total - LHS - arr[i]

	public static void main(String[] args) {
		int arr[] = { 9, 3, 7, 6, 8, 1, 10 };
		System.out.println(Arrays.toString(arr) + " -> " + getEquilibriumIndex(arr));

		int arr2[] = { -7, 1, 5, 2, -4, 3, 0 };
		System.out.println(Arrays.toString(arr2) + " -> " + getEquilibriumIndex(arr2));

		int arr3[] = { 9 };
		System.out.println(Arrays.toString(arr3) + " -> " + getEquilibriumIndex(arr3));

		int arr4[] = { 9, 9 };
		System.out.println(Arrays.toString(arr4) + " -> " + getEquilibriumIndex(arr4));

		int arr5[] = { 0, 0 };
		System.out.println(Arrays.toString(arr5) + " -> " + getEquilibriumIndex(arr5));
	}

	private static int getEquilibriumIndex(int[] arr) {
		int total = 0;
		for (int x : arr) {
			total += x;
		}
		int LHS = 0;
		for (int i = 0; i < arr.length; i++) {
			int RHS = total - LHS - arr[i];
			if (LHS == RHS) {
				return i;
			}
			LHS += arr[i];
		}
		return -1;
	}

}
