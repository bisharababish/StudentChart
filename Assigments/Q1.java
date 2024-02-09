package  Assigments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {
	// Function to remove duplicates
	public static <A> ArrayList<A> remove(ArrayList<A> list) {
		ArrayList<A> num = new ArrayList<A>();
		for (A element : list) {
			if (!num.contains(element)) {
				num.add(element);
			}
		}
		return num;
	}

	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 5, 5, 9, 10, 10, 11));
		// Print unchanged ArrayList
		System.out.println("unchanged ArrayList: " + list);
		// Call the function to remove duplicates and print it
		ArrayList<Integer> num = remove(list);
		System.out.println("changed ArrayList: " + num);
	}
}

