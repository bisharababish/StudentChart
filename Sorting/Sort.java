
package Sorting;
public class Sort {
	// insertion sort
	void insert(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				System.out.print(arr[i] + " swap ");
				System.out.println();
			}
			System.out.print(arr[i] + " no swap ");
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 15, 20, 2, 18, 23, 32, 14, 5 };
		Sort sorting = new Sort();
		sorting.insert(arr);
	}
}