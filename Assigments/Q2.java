package Assigments;

public class Q2 {
    static void reverse(int array[], int n) {
		int[] num = new int[n];
		int x = n;
		for (int i = 0; i < n; i++) {
			num[x - 1] = array[i];
			x -= 1;
		}
		// Print the reversed array
		System.out.println("reversed: ");
		for (int j = 0; j < n; j++) {
			System.out.print(num[j] + " ");
		}

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// Print the array
		System.out.println("array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// Call the function to reverse the array and print it
		System.out.println();
		reverse(array, array.length);
	}
}
