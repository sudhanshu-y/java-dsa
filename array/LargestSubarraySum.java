package array;

import java.util.Arrays;

public class LargestSubarraySum {

	public static void main(String[] args) {
		int arr[] = { -3, 4, -1, -2, 1, 5 };
		System.out.println(Arrays.toString(arr) + " : " + getLargestSubarraySum(arr));// 7

		int arr2[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(Arrays.toString(arr2) + " : " + getLargestSubarraySum(arr2));// 6

		int arr3[] = { 1 };
		System.out.println(Arrays.toString(arr3) + " : " + getLargestSubarraySum(arr3));// 1

		int arr4[] = { 5, 4, -1, 7, 8 };
		System.out.println(Arrays.toString(arr4) + " : " + getLargestSubarraySum(arr4));// 23
	}

	// -ve number never contributes to max sum --> if -ve then make sum=0 ==> slide window
	private static int getLargestSubarraySum(int[] arr) {
		int maxSum = arr[0], curSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (curSum < 0) {
				curSum = 0;
			}
			curSum += arr[i];
			maxSum = Math.max(maxSum, curSum);
		}
		return maxSum;
	}

}
