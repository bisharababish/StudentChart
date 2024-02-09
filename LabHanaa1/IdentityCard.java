package LabHanaa1;

import java.util.Scanner;
public class IdentityCard {

		// Attributes
		static int arr[] = new int[10];
		static int weight[] = new int[10];
		static int result[] = new int[10];
		int total = 0;
		int i = 0;

		// Displays the array
		void display(int[] arr) {
			for (int i = 0; i < 9; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

		// Write the ID number in 9 digits, if the ID number is less than 9 digits,
		// complete leading zeros on the left side of the number
		void inPut() {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the ID: ");
			int id = s.nextInt();
			int j = id;
			while (j > 0) {
				arr[9 - i - 1] = j % 10;
				i++;
				j = j / 10;
			}
		}

		// Below each digit of the ID number, write from the right side of the number
		// the digits 1, then 2, then again 1, then again 2 and repeat until the end.
		// These numbers are called weights.
		void weights(int[] weight) {
			int i = 0;
			weight[i] = 1;
			i++;
			weight[i] = 2;
			i++;
			weight[i] = 1;
			i++;
			weight[i] = 2;
			i++;
			weight[i] = 1;
			i++;
			weight[i] = 2;
			i++;
			weight[i] = 1;
			i++;
			weight[i] = 2;
			i++;
			weight[i] = 1;
		}

		// Multiply by an abbreviated multiplication, without bearing any digit in the
		// ID number with the digit below it (weight). The result, even if it is in two
		// digits, is written below a third line.
		void multiply(int[] result, int[] arr, int[] weight) {
			for (i = 0; i < 10; i++) {
				result[i] = arr[i] * weight[i];
			}
		}

		// The results become the results of one digit. For example, if a result is a
		// two-digit number, add all the digits of the number to one digit.
		void AddTwoDigits(int[] result) {
			for (i = 0; i < 9; i++) {
				if (result[i] > 9) {
					result[i] = result[i] - 9;
				}
			}
		}

		// Now, connect all the digits in a simple arithmetic addition until a result
		// is obtained. The result must be a number divisible by 10 with no remainder
		void sum() {
			for (i = 0; i < 8; i++) {
				total = total + result[i];
				System.out.print(result[i] + " + ");
			}
			total = total + result[i];
			System.out.print(result[i] + " = " + total);
			if (total % 10 == 0) {
				System.out.print(" Correct ID");
			} else {
				System.out.print(" Incorrect ID");
			}
		}

		public static void main(String[] args) {
			IdentityCard id = new IdentityCard();
			id.inPut();
			id.display(arr);
			id.weights(weight);
			id.display(weight);
			id.multiply(result, arr, weight);
			id.display(result);
			id.AddTwoDigits(result);
			id.display(result);
			id.sum();
		}
	}