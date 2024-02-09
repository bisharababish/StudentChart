package menusorts;

import java.util.Scanner;

public class Insertion {

    public static void main(String[] args) {
        int Size, index, j, element;
        Scanner Input = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        Size = Input.nextInt();
        int[] array = new int[Size];
        for (index = 0; index < Size; index++)
            array[index] = (int) (Math.random() * 100);

        for (index = 1; index < Size; index++) {
            element = array[index];

            for (j = (index - 1); j >= 0 && array[j] > element; j--)
                array[j + 1] = array[j];

            array[j + 1] = element;
        }

        System.out.println("\nThe new sorted array is: ");
        System.out.println("");
        for (index = 0; index < Size; index++)
            System.out.print(array[index] + " ");
    }
}