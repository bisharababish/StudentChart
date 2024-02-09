package MenuLists;


import java.util.Scanner;

public class DoubleLinkedList {
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		System.out.println("\n1.Create Linked List");
		System.out.println("Enter number of Elements in Linked List = ");
		Scanner Input = new Scanner(System.in);
		int v = Input.nextInt();
		System.out.println("Element Number 1 = ");
		Scanner SInput = new Scanner(System.in);
		int r = SInput.nextInt();

		Node head = new Node(r);
		for (int d = 2; d <= v; d++) {
			System.out.println("Element Number " + d + " = ");

			Scanner InputNS = new Scanner(System.in);
			int NS = InputNS.nextInt();

			Node newNode = new Node(NS);
			newNode.next = head;
			head = newNode;
		}

		while (true) {
			System.out.println("\nCustom Functions:");
			System.out.println("\n2.Insert Functions" + "\n3.Delete Functions" + "\n4.Count" + "\n5.Max" + "\n6.Min"
					+ "\n7.Display" + "\n8.Search" + "\n9.Exit");
			System.out.print("\nEnter Your Choice : ");

			Scanner ChoiceONE = new Scanner(System.in);
			int choice = ChoiceONE.nextInt();
			switch (choice) {
			case 1:
				System.out.println("\n");
				System.out.println("The List:");
				Node n = head;
				while (n != null) {
					System.out.print(n.data + " ");
					n = n.next;
				}
				System.out.println("\n");
				break; // case 1 choice1
			case 2:
				System.out.println("Insert");
				while (true) {
					System.out.println("\n1.Insert At The Beginning" + " \n2.Insert At The end"
							+ " \n3.Insert At Index x" + " \n4.Insert After x" + " \n5.Insert Before x");
					System.out.print("\nEnter Your Choice : ");
					Scanner ChoiceTWO = new Scanner(System.in);
					int choice2 = ChoiceTWO.nextInt();

					switch (choice2) {
					case 1:
						System.out.println("Insert At The Beginning:");
						System.out.println("\nEnter Node value to insert at the Beginning = ");
						Scanner InputR = new Scanner(System.in);
						int R = InputR.nextInt();
						Node newhead = new Node(R);
						newhead.next = head;
						head = newhead;
						System.out.println("\n");
						System.out.println("The List:");
						Node j = head;
						while (j != null) {
							System.out.print(j.data + " ");
							j = j.next;
						}
						System.out.println("\n");
						break; // case 1 choice 2
					case 2:
						System.out.print("Insert At The End:");
						System.out.println("E\nnter Node value  = ");
						Scanner InputT = new Scanner(System.in);
						int t = InputT.nextInt();
						Node newtail = new Node(t);
						System.out.println("\n");
						System.out.println("The List:");
						Node q = head;
						Node o = newtail;
						while (q != null) {
							System.out.print(q.data + " ");
							q = q.next;
						}
						System.out.print(o.data + " ");
						System.out.println("\n");
						break; // case 1 choice2
					case 3:
						System.out.println("Insert At Index x:");
						System.out.println("\nEnter number of index x = ");
						Scanner InputQ = new Scanner(System.in);
						int Q = InputQ.nextInt();
						System.out.println("Enter Node value  = ");
						Scanner InputS = new Scanner(System.in);
						int S = InputS.nextInt();

						Node temp = head;
						for (int z = 1; z <= Q - 1; z++)
							temp = temp.next;
						Node FT = temp.next;
						Node XD = new Node(S);
						XD.next = FT;
						temp.next = XD;
						System.out.println("\n");
						System.out.println("The List:");
						Node l = head;
						while (l != null) {
							System.out.print(l.data + " ");
							l = l.next;
						}
						System.out.println("\n");
						break; // case 3 choice 2
					case 4:
						System.out.println("Insert After x:");
						System.out.println("\nEnter number of index x = ");
						Scanner InputN = new Scanner(System.in);
						int z = InputN.nextInt();
						System.out.println(" Enter Node value  = ");
						Scanner dsd = new Scanner(System.in);
						int dssd = dsd.nextInt();
						Node temp2 = head;
						for (int a = 1; a <= z; a++)
							temp2 = temp2.next;
						Node SS = temp2.next;
						Node ZZ = new Node(dssd);
						ZZ.next = SS;
						temp2.next = ZZ;
						System.out.println("\n");

						System.out.println("The List:");
						Node la = head;
						while (la != null) {
							System.out.print(la.data + " ");
							la = la.next;
						}
						System.out.println("\n");
						break; // case 4 choice 2
					case 5:
						System.out.println("Insert Before x");
						System.out.println("\nEnter number of index x = ");
						Scanner InputD = new Scanner(System.in);
						int D = InputD.nextInt();
						System.out.println(" Enter Node value  = ");
						Scanner InputU = new Scanner(System.in);
						int U = InputU.nextInt();
						Node temp3 = head;
						for (int a = 1; a <= D - 2; a++)
							temp3 = temp3.next;
						Node aft3 = temp3.next;
						Node xxx = new Node(U);
						xxx.next = aft3;
						temp3.next = xxx;
						System.out.println("\n");
						System.out.println("The List:");
						Node da = head;
						while (da != null) {
							System.out.print(da.data + " ");
							da = da.next;
						}
						System.out.println("\n");
						break;
					} // end of choice2
					System.out.println("Enter 1 For Insert Functions:");
					System.out.println("Enter 99 To Return to the main Functions.");
					int exit = ChoiceTWO.nextInt();
					if (exit == 99) {
						break; // case 2 choice 1
					}
				}
				break;
			case 3:
				System.out.print("\nDelete");
				while (true) {
					System.out.println("\n1.Delete first (Delete head)" + "  \n2.Delete last (Delete tail)"
							+ " \n3.Delete Node at index k" + " \n4.Delete Node after Node x"
							+ " \n5.Delete Node before Node x");
					System.out.print("\nEnter Your Choice : ");
					Scanner ThirdChoice = new Scanner(System.in);
					int choice3 = ThirdChoice.nextInt();
					System.out.println("\n" + "****");
					// case 1 choice 3
					switch (choice3) {
					case 1:
						System.out.println("Delete first (Delete head)");
						Node tempde = head;
						head = head.next;
						System.out.println("\n");
						System.out.println("The List:");
						Node j = head;
						while (j != null) {
							System.out.print(j.data + " ");
							j = j.next;
						}
						System.out.println("\n");
						break; // case 1 choice 3
					case 2:
						System.out.print("Delete last (Delete tail)");
						Node temp9 = head;
						while (temp9.next.next != null) {
							temp9 = temp9.next;
						}
						temp9.next = null;
						System.out.println("\n");
						System.out.println("The List:");
						Node de = head;
						while (de != null) {
							System.out.print(de.data + " ");
							de = de.next;
						}
						System.out.println("\n");
						break; // case 2 choice 3
					case 3:
						System.out.println("Delete Node at index k");
						System.out.println("\nEnter number of index k = ");
						Scanner InputK = new Scanner(System.in);
						int K = InputK.nextInt();
						Node temp = head;
						for (int z = 1; z <= K - 1; z++)
							temp = temp.next;
						Node delk = temp.next;
						Node aftk = delk.next;
						temp.next = aftk;
						System.out.println("\n");
						System.out.println("The List:");
						Node l = head;
						while (l != null) {
							System.out.print(l.data + " ");
							l = l.next;
						}
						System.out.println("\n");
						break; // case 3 choice 3
					case 4:
						System.out.println("Delete Node after Node x");
						System.out.println("\nEnter number of index x = ");
						Scanner InputZ = new Scanner(System.in);
						int Z = InputZ.nextInt();
						Node temp2 = head;
						for (int a = 1; a <= Z; a++)
							temp2 = temp2.next;
						Node delk2 = temp2.next;
						Node aftk2 = delk2.next;
						temp2.next = aftk2;
						System.out.println("\n");
						System.out.println("The List:");
						Node la = head;
						while (la != null) {
							System.out.print(la.data + " ");
							la = la.next;
						}
						System.out.println("\n");
						break; // case 4 choice 3
					case 5:
						System.out.println("Delete Node before Node x");
						System.out.println("\nEnter number of index x = ");
						Scanner InputA = new Scanner(System.in);
						int A = InputA.nextInt();
						Node temp3 = head;
						for (int a = 1; a < A - 1; a++)
							temp3 = temp3.next;
						Node delk3 = temp3.next;
						Node aftk3 = delk3.next;
						temp3.next = aftk3;
						System.out.println("\n");
						System.out.println("The List:");
						Node da = head;
						while (da != null) {
							System.out.print(da.data + " ");
							da = da.next;
						}
						System.out.println("\n");
						break; // case 5 choice 3
					} // end choice 3
					System.out.println("Enter 1 For Delete Funcrions");
					System.out.println("Enter 99 To Return to the main Functions.");
					int exit = ThirdChoice.nextInt();
					if (exit == 99) {
						break;
					}
				}
				break;
			case 4:
				System.out.println("Count");
				int count = 1;
				Node tempc = head;
				while (tempc.next != null) {
					count++;
					tempc = tempc.next;
				}
				System.out.println("\n");
				System.out.println("Return Number of Nodes");
				System.out.println("Count = " + count);
				System.out.println("\n");
				break; // case 4 choice 1
			case 5:
				System.out.println("Max");
				Node fimx = head;
				int max = head.data;
				while (fimx != null) {
					if (max < fimx.data) {
						max = fimx.data;
					}

					fimx = fimx.next;
				}
				System.out.println("\n");
				System.out.println("Max Value Stored In the List is:");
				System.out.println("Max = " + max);
				System.out.println("\n");
				break; // case 5 choice 1
			case 6:
				System.out.println("Min");
				Node fimn = head;
				int min = head.data;
				while (fimn != null) {
					if (min > fimn.data) {
						min = fimn.data;
					}
					fimn = fimn.next;
				}
				System.out.println("\n");
				System.out.println("Min Value Stored In The List:");
				System.out.println("Min = " + min);
				System.out.println("\n");
				break; // case 6 choice 1
			case 7:
				System.out.println("Display");
				System.out.println("\n");
				System.out.println("All of the Elements in the List:");
				System.out.println("The List:");
				Node da = head;
				while (da != null) {
					System.out.print(da.data + " ");
					da = da.next;
				}
				System.out.println("\n");
				break; // case 7 choice 1
			case 8:
				System.out.println("Search");
				System.out.println("Search for Node Contains k Value");
				System.out.println("Enter k = ");
				Scanner InputF = new Scanner(System.in);
				int F = InputF.nextInt();
				int k = 0;
				Node temp = head;
				while (temp.data != F) {
					k++;
					temp = temp.next;
					if (temp == null) {
						System.out.println("There is None Found.");
					}
				}
				System.out.println("\n");
				System.out.println("k is in index = " + k);
				System.out.println("\n");
				break; // case 8 choice 1
			case 9:
				System.out.println("GoodBye!");
				System.exit(0);
				break; // case 9 choice 1
			default:
				System.out.println("There is no operations Found.");
			} // end of choice 1
			System.out.println("Enter 1 To continue");
			System.out.println("Enter 99 To Exist The Program");
			int exit = ChoiceONE.nextInt();
			if (exit == 99) {
				break;
			}
		}
	}
}