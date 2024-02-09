package Assigments;

import java.util.Arrays;

public class Q3 {
    
	public static void main(String[] args) {
		int[] array = { 9, 5, 10, 15, 2, 25, 20, 16, 22, 14, 29, 30, 27, 6 };
		// Sort the Array using Arrays.sort
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}

