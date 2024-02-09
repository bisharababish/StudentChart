package start;

import java.util.Scanner;

public class Account {

	public static String accountTitle;
	private static double openingBal;
	public static String emailID;
	public static int accountID = 1;

	public static void main(String[] args) {
		methodes obj = new methodes();
		int choice = 0;
		while (choice != 99) {

			System.out.println("\n1.Open Account \n2. Exit");

			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			switch (choice) {
			case 1:
				obj.ID();
				System.out.println("\n");
				obj.Title();
				System.out.println("\n");
				obj.Balance();
				System.out.println("\n");
				obj.emailID();
				System.out.println("\n");
				System.out.println("\n------------Confirguration: <Default>------------");
				System.out.println("ID: " + accountID);
				System.out.println("Title: " + accountTitle);
				System.out.println("Balance: " + openingBal);
				System.out.println("emailID: " + emailID);
				accountID++;
				break;
			case 2:
				System.out.println("Exiting the program");
				System.exit(0);
				break;
			default:
			}
		}
	}

	static class methodes {
		Scanner scan = new Scanner(System.in);

		public void emailID() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your E-mail: ");
			emailID = sc.nextLine();
			System.out.print("\nYour E-mail is: " + emailID);
		}

		public void Title() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Account Title:");
			accountTitle = sc.nextLine();
			System.out.println("Your Title is " + "'" + accountTitle + "'");
		}

		public void ID() {
			System.out.println("Your ID: " + Account.accountID);
		}

		public void Balance() {
			System.out.println("Balance? must be 5000 or more.");
			openingBal = scan.nextInt();
			double sum = 5000 - openingBal;
			while (openingBal < 5000.0) {
				System.out.println("\nYou have to pay " + sum + " or more: ");
				int newbal = scan.nextInt();
				double sum2 = sum - newbal;
				openingBal = openingBal + newbal;
				sum = sum2;
			}
			System.out.print("\n Your Balance is : " + openingBal);
		}
	}
}
