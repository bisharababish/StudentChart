package Sorting;
import java.util.ArrayList;
import java.util.Arrays;
public class SortingArrayFinalTest {
  

//remove duplicates
	public static <a> ArrayList<a> remove(ArrayList<a> list) {
		ArrayList<a> num = new ArrayList<a>();
		for (a element : list) {
			if (!num.contains(element)) {
				num.add(element);
			}
		}
		return num;
	}

//reverse array
	static void reverse(int array[], int n) {
		int[] num = new int[n];
		int x = n;
		for (int i = 0; i < n; i++) {
			num[x - 1] = array[i];
			x -= 1;
		}
		System.out.println("Reversed: ");
		for (int j = 0; j < n; j++) {
			System.out.print(num[j] + " ");
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> List = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6));
		System.out.println("Unchanded duplicates: " + List);
		ArrayList<Integer> num = remove(List);
		System.out.println("Changed duplicates: " + num);
		int[] array = { 5, 4, 9, 2, 7, 3, 6 };
//Sort Array
		System.out.println("Unchanged Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		reverse(array, array.length);
		System.out.println("\nSorted array:");
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
//Get min and max value
		System.out.println();
		int min = List.get(0);
		int max = List.get(0);
		int n = List.size();
		for (int i = 0; i < n; i++) {
			if (List.get(i) < min) {
				min = List.get(i);
			}
		}
		for (int i = 0; i < n; i++) {
			if (List.get(i) > max) {
				max = List.get(i);
			}
		}
		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}

}
