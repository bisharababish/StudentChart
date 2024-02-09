package menusorts;

import java.util.Scanner;

public class Quick {

    public static int partition(int array[], int low, int high) {
        int i = low + 1, j = high, c = low, temp;

        for (; i <= j;) {

            while (i <= high && array[i] < array[c])
                i++;
            while (array[j] > array[c] && j > low)
                j--;

            if (i < j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            } else
                break;
        }
        temp = array[c];
        array[c] = array[j];
        array[j] = temp;
        return j;
    }

    public static void Sort(int array[], int l, int h) {
        if (l < h) {
            int m = partition(array, l, h);
            Sort(array, l, m - 1);
            Sort(array, m + 1, h);
        }

    }

    public static void printarray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n, res, i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        System.out.println("Elements in array: ");
        System.out.println("");
        printarray(a);
        System.out.println("");
        Sort(a, 0, n - 1);
        System.out.println("\nElements after sorting:");
        System.out.println("");
        printarray(a);

    }

}