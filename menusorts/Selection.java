package menusorts;

import java.util.*;

public class Selection {

    public static void main(String[] args) {

        int index, indexSecond;
        int Third;
        int size;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter how many Numbers to be sorted");
        size = Input.nextInt();

        int array[] = new int[size];
        for (index = 0; index < size; index++) {
            array[index] = (int) (Math.random() * 100);
        }
        for (index = 0; index < size; index++) {
            for (indexSecond = index; indexSecond < size; indexSecond++) {
                if (array[index] > array[indexSecond]) {
                    Third = array[index];
                    array[index] = array[indexSecond];
                    array[indexSecond] = Third;
                }
            }
        }
        for (index = 0; index < size; index++) {
            System.out.println("Sorted array is " + array[index]);
        }
    }
}