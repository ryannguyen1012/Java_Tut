package lab02;

import java.util.Arrays;

public class array {
	public static void main(String[] args) {
		int[] clubs = { 5, 10, 25, 6, 1, 20 };
		System.out.println("Array before sorting: " + Arrays.toString(clubs));

		for (int i = 0; i < clubs.length - 1; i++) {
			for (int j = i + 1; j < clubs.length; j++) {
				if (clubs[i] > clubs[j]) {
					int temp = clubs[i];
					clubs[i] = clubs[j];
					clubs[j] = temp;
				}
			}
		}
		System.out.println("array after sorting: " + Arrays.toString(clubs));
	}

}
