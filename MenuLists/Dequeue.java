package MenuLists;
import java.util.*;



public class Dequeue {
	public static void main(String[] args) {

        int choice = 1;
        Queuec Teller = new Queuec();

        while (choice != 99) {
            System.out.print("\n\t\t\t\tQueue Main Menu \n\n");

            System.out.println("\n\t\t\t\t1.Enqueue from the Head "
                    + "\n\t\t\t\t2.Enqueue from the Tail "
                    + "\n\t\t\t\t3.Dequeue from the Head"
                    + "\n\t\t\t\t4.Denqueue from the Tail "
                    + "\n\t\t\t\t5.The Top Element"
                    + "\n\t\t\t\t99. Main Menu");
            System.out.println("\n\t\t\t\tEnter Your Choice:");
            Scanner mydata = new Scanner(System.in);
            choice = mydata.nextInt();

            switch (choice) {
                case 1:
                    Teller.insertHead();
                    System.out.println("\n-------------------------------------------------\n");
                    break;
                case 2:
                    Teller.insertTail();
                    System.out.println("\n-------------------------------------------------\n");
                    break;
                case 3:
                    Teller.removeHead();
                    System.out.println("\n-------------------------------------------------\n");
                    break;
                case 4:
                    Teller.removeTail();
                    System.out.println("\n-------------------------------------------------\n");
                    break;
                case 5:
                    Teller.top();
                    System.out.println("\n-------------------------------------------------\n");
                    break;
                default:
                    break;
            }
        }
    }
}

class Node {

    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Queuec {

    Node head = null;
    Node prev;
    Node tail = null;

    public void insertHead() {
        System.out.println("\nEnter A Number To Insert At The Beginning: ");
        Scanner InputR = new Scanner(System.in);
        int R = InputR.nextInt();
        
        Node newhead = new Node(R);
        newhead.next = head;
        head = newhead;
        
        System.out.println("\n");
        System.out.println("The DeQueue:");
        Node j = head;
        while (j != null) {
            System.out.print(j.data + " ");
            j = j.next;
        }
        System.out.println("\n");

    }

    public void insertTail() {
        System.out.print("\nInsert At The End:");
        System.out.println("Enter Node value  = ");
        Scanner FirstInput = new Scanner(System.in);
        int t = FirstInput.nextInt();

        Node newtail = new Node(t);
        newtail.next = null;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = newtail;
        System.out.println("The List::");
        Node q = head;
        while (q != null) {
            System.out.print(q.data + " ");
            q = q.next;
        }
        System.out.println("\n");
    }

    public void removeHead() {
        Node j = head;
        if (j != null) {
            Node tempde = head;
            head = head.next;
            System.out.println("\n");
            System.out.println("The DeQueue:");
            while (j != null) {
                System.out.print(j.data + " ");
                j = j.next;
            }
            System.out.println("\n");
        } else {
            System.out.println("\nQueue is Empty!");
        }
    }

    public void removeTail() {
        Node de = head;
        if (de != null) {

            Node temp9 = head;
            head = head.next;
            temp9 = null;
            System.out.println("\n");
            System.out.println("The DeQueue:");
            while (de != null) {
                System.out.print(de.data + " ");
                de = de.next;
            }
            System.out.println("\n");
        } else {
            System.out.print("DeQueue is Empty!");
        }
    }

    public void top() {
        Node fimx = head;
        int max = head.data;
        while (fimx != null) {
            if (max < fimx.data) {
                max = fimx.data;
            }

            fimx = fimx.next;
        }
        System.out.println("\n");
        System.out.println("Top Value Stored In the DeQueue is:");
        System.out.println("Top = " + max);
        System.out.println("\n");

    }
}