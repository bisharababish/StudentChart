package menusorts;

import java.io.*;
import java.util.*;

public class mainMenu {

    public static void main(String[] args) throws IOException {
        Scanner myInput = new Scanner(System.in);

        int choice = 0;
        while (choice != 99) { // 99 stop
            System.out.println("\n\n");
            System.out.print("\n\t\t\t\t\tMain Menu \n\n");
            System.out.println("\t\t\t Please enter a number (1-5)for a function.");
            System.out.println(" ");
            System.out.println("\t\t\t\t\t1. Selection sort");
            System.out.println("\t\t\t\t\t2. Insertion sort");
            System.out.println("\t\t\t\t\t3. Bubble Sort ");
            System.out.println("\t\t\t\t\t4. Merge sort");
            System.out.println("\t\t\t\t\t5. Quick sort");
            System.out.println("\t\t\t\t\t   6.Exit");
            System.out.println(" ");

            choice = myInput.nextInt();
            switch (choice) {
                case 1:
                    Selection.main(args);
                    System.out.println("");
                    break;
                case 2:
                    Insertion.main(args);
                    System.out.println("");
                    break;
                case 3:
                    Bubble.main(args);
                    System.out.println("");
                    break;
                case 4:
                    Merge.main(args);
                    System.out.println("");
                    break;
                case 5:
                    Quick.main(args);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("\nGoodBye!\n\n");
                    System.exit(0);
                    System.out.println("\n-------------------------------------------------\n");
                    break;
                default:
            }
        }
    }
}
