
package menusorts;

import java.util.Scanner;

public class Bubble {

   public static void main(String[] args) {
      int size = 10, i, j, x;
      int[] array = new int[size];
      Scanner s = new Scanner(System.in);
      System.out.println("Enter how many Numbers to be sorted");
      size = s.nextInt();
      System.out.print("");
      for (i = 0; i < size; i++) {
         array[i] = (int) (Math.random() * 100);
      }

      for (i = 0; i < (size - 1); i++) {
         for (j = 0; j < (size - i - 1); j++) {
            if (array[j] > array[j + 1]) {
               x = array[j];
               array[j] = array[j + 1];
               array[j + 1] = x;
            }
         }
      }

      System.out.println("\nThe new sorted array is:");
      for (i = 0; i < size; i++)
         System.out.print(array[i] + " ");
   }
}