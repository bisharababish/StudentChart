package Random;

import java.util.Scanner;

public class IdFind {

    // Attributes
    static int arr[] = new int[10];
    static int weight[] = new int[10];
    static int result[] = new int[10];
    int total = 0;
    int i = 0;

    // Displays the elements in the array
    void display(int[] arr) {
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // takes the id from the user and inputs it in the array
    void inPut() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the ID, it  can't be over 9 digits: ");
        int id = s.nextInt();
        int j = id;
        while (j > 0) {
            arr[9 - i - 1] = j % 10;
            i++;
            j = j / 10;
        }
    }

    // adds weights to the elements
    void weights(int[] weight) {
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                weight[i] = 1;
            } else {
                weight[i] = 2;
            }
        }
    }

    // multiply the elements with the weights, and add two digits
    // into one if they're above 9
    void multiply(int[] result, int[] arr, int[] weight) {
        for (i = 0; i < 10; i++) {
            result[i] = arr[i] * weight[i];
        }
    }

    // adds a two digits number into one if they're above 9
    void AddTwoDigits(int[] result) {
        for (i = 0; i < 9; i++) {
            if (result[i] > 9) {
                result[i] = result[i] - 9;
            }
        }
    }

    // sums all the elements and check if they're divisible by 10
    void sum() {
        for (i = 0; i < 8; i++) {
            total = total + result[i];
            System.out.print(result[i] + " + ");
        }
        total = total + result[i];
        System.out.print(result[i] + " = " + total);
        if (total % 10 == 0) {
            System.out.print(" valid ID");
        } else {
            System.out.print(" invalid ID");
        }
    }

    public static void main(String[] args) {
        IdFind find = new IdFind();
        find.inPut();
        find.display(arr);
        find.weights(weight);
        find.display(weight);
        find.multiply(result, arr, weight);
        find.display(result);
        find.AddTwoDigits(result);
        find.display(result);
        find.sum();
    }
}
