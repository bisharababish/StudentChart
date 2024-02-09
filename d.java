
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class d {

    public static void main(String[] rgs) {

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Which graph do you want 1: for 2D array, 2: for linkedlist?");
            int y = s.nextInt();
            if (y > 0 && y < 3) {
                switch (y) {
                    case 1:
                        Scanner arr = new Scanner(System.in);
                        System.out.println("How many vertex in the Graph?");
                        int w = arr.nextInt();

                        int vertex[][] = new int[w][w];
                        for (int i = 0; i < vertex.length; i++) {
                            for (int j = i; j < w; j++) {
                                System.out.println("Is there an Edge between V: " + i + " and V:" + j);
                                int xw = arr.nextInt();
                                vertex[i][j] = xw;
                            }
                        }
                        System.out.print("  ");
                        for (int i = 0; i < w; i++) {
                            System.out.print("V" + i + " ");
                        }
                        System.out.println();
                        for (int i = 0; i < vertex.length; i++) {
                            System.out.print("V" + i + " ");
                            for (int j = 0; j < w; j++) {
                                System.out.print(vertex[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        Scanner lin = new Scanner(System.in);
                        System.out.println("How many vertex in the Graph?");
                        int x = lin.nextInt();

                        ArrayList<LinkedList> LinkedListMain = new ArrayList<LinkedList>();

                        Scanner Input2 = new Scanner(System.in);
                        System.out.println("The Edges: ");
                        for (int i = 0; i < x; i++) {

                            LinkedList<Integer> SecondLinkedList = new LinkedList<Integer>();

                            for (int j = 0; j < x; j++) {
                                System.out.println("Is there an Edge between V:" + i + " and V:" + j + " =");
                                SecondLinkedList.add(Input2.nextInt());
                            }
                            LinkedListMain.add(i, SecondLinkedList);
                            System.out.println("");
                        }

                        for (int i = 0; i < LinkedListMain.size(); i++) {
                            System.out.print("V" + i);
                            for (int j = 0; j < LinkedListMain.get(i).size(); j++) {
                                System.out.print(" --> " + LinkedListMain.get(i).get(j));
                            }
                            System.out.println();
                        }
                        System.out.println();
                        break;

                }
            }
            break;
        }
    }
}
