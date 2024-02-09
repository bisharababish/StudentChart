package Assigments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4 {
    public static void main(String args[]) {
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(13, 2, 26, 25, 30, 40));
		int min = num.get(0);
		int max = num.get(0);
		int n = num.size();
		// Get minimum value
		for (int i = 1; i < n; i++) {
			if (num.get(i) < min) {
				min = num.get(i);
			}
		}
		// Get maximum value
		for (int i = 1; i < n; i++) {
			if (num.get(i) > max) {
				max = num.get(i);
			}
		}
		// Print maximum and minimum value
		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}
}

