package menusorts;

import java.util.Scanner;

public class Merge {

    public static void merge(int array[], int low, int mid, int high) {
        int i, j, c = low;
        int b[] = new int[high + 1];
        for (i = low, j = mid + 1; i <= mid && j <= high; c++) {

            if (array[i] <= array[j])
                b[c] = array[i++];
            else
                b[c] = array[j++];
        }
        while (i <= mid)
            b[c++] = array[i++];

        while (j <= high)
            b[c++] = array[j++];

        for (i = low; i <= high; i++)
            array[i] = b[i];
    }

    public static void Sort(int array[], int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            Sort(array, l, m);
            Sort(array, m + 1, h);
            merge(array, l, m, h);
        }
    }

    public static void printarray(int array[]) {
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int n, res, i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        System.out.println("");
        n = s.nextInt();
        int array[] = new int[n];
        for (i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Elements in array: ");
        System.out.println("");
        printarray(array);
        System.out.println("");
        Sort(array, 0, n - 1);
        System.out.println("\nElements after sorting:");
        System.out.println("");
        printarray(array);

    }

}