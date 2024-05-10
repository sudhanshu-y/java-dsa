package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(l);// [1, 2, 3, 4, 5]

		Collections.reverse(l);
		System.out.println(l);// [5, 4, 3, 2, 1]
	}

}
