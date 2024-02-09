package AtmExamCode;

import java.util.Scanner;

public class OldTwoATM {

	private int Balance;

	public OldTwoATM() {
		System.out.println("Ready to accept your bank card");
		Balance = 0;
		Pin();
		SelectTransaction();
	}

	@SuppressWarnings("resource")
	public void SelectTransaction() {
		System.out.println("\n1.To deposit \n2.To withdraw \n3.To show your balance");
		int s = new Scanner(System.in).nextInt();
		switch (s) {
		case 1:
			Deposit();
			break;
		case 2:
			WithDraw();
			break;
		case 3:
			DisplayBal();
			break;
		}
	}

	@SuppressWarnings("resource")
	public void Deposit() {
		System.out.println("How much do you want to deposit? ");
		int scan = new Scanner(System.in).nextInt();
		Balance = Balance + scan;
		System.out.println("You have deposited: " + scan + " Your Balance is: " + Balance);
		Select();
	}

	@SuppressWarnings("resource")
	public void Select() {
		System.out.println("\n1.To exit \n2.To reselect transaction");
		int s = new Scanner(System.in).nextInt();
		if (s == 1) {
			System.out.println("\nExiting the program!");
			System.exit(0);
		} else if (s == 2) {
			SelectTransaction();
		}
	}

	@SuppressWarnings("resource")
	public void WithDraw() {
		System.out.println("How much do you want to withdraw? ");
		int i = new Scanner(System.in).nextInt();
		if (Balance < i) {
			System.out.println("You do not have enough money to make this transaction!");
		} else {
			Balance = Balance - i;
			System.out.println("The transaction was successful!");
		}
		Select();
	}

	public void DisplayBal() {
		System.out.println("\nYou have: " + Balance + " left in your account");
		Select();
	}

	@SuppressWarnings({ "resource", "unused" })
	public void Pin() {
		System.out.println("Enter your name");
		String pin = new Scanner(System.in).nextLine();
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("\nEnter your pin number");
		String n = new Scanner(System.in).nextLine();
		list.Insert(n);
		System.out.println("\nSearch for your pin");
		String pin = new Scanner(System.in).nextLine();
		for (int i = 0; i <= list.getSize(); i++) {
			if (list.getName(i).equals(pin)) {
				System.out.println("Your account found");
				new OldTwoATM();
			}
		}
	}
}

class LinkedList {
	Node head;
	Node tail;

	public void Insert(String pin) {
		Node n = new Node();
		n.pin = pin;

		if (head == null) {
			head = n;
		} else {
			Node n2 = head;
			while (n2.next != null) {
				n2 = n2.next;
			}
			n2.next = n;
		}
	}

	public String getName(int i) {
		Node n = head;
		for (int j = 0; j < i; j++) {
			n = n.next;
		}
		return n.pin;
	}

	public int getSize() {
		Node n = head;
		int size = 0;
		while (n.next != null) {
			size = size + 1;
			n = n.next;
		}
		return size;
	}

	public void Show() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.pin);
			n = n.next;
		}
		System.out.println(n.pin);
	}
}

class Node {
	String pin;
	Node next;
}