package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayInGroup {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		System.out.println(l);

		reverseInGroups(l, 3);
		System.out.println(l);

		ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(5, 6, 8, 9));
		System.out.println(l2);

		reverseInGroups(l2, 2);
		System.out.println(l2);

	}

	// Time Complexity: O(n) - as each element accessed only once
	private static void reverseInGroups(ArrayList<Integer> al, int k) {
		int n = al.size();
		for (int i = 0; i < n; i += k) {
			int start = i;
			int end = Math.min(i + k - 1, n - 1);
			while (start < end) {
				Collections.swap(al, start++, end--);
			}
		}
	}
}
