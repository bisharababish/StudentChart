package MenuLists;


import java.io.*;
import java.util.*;
public class Menu {



	 public static void main(String args[]) throws IOException {
	        Scanner myInput = new Scanner(System.in);

	        int choice = 0;
	        while (choice != 99) { // 99 stop
	            System.out.println( "\n\n");
	            System.out.print ("\n\t\t\t\t\tMain Menu \n\n");
	            System.out.println ("\t\t\t Please enter a number (1-5)for a function.");
	            System.out.println ("\t\t\t\t1. Single Linked List") ;
	            System.out.println ("\t\t\t\t2. Double Linked List");
	            System.out.println ("\t\t\t\t\t 3.Stack");
	            System.out.println ("\t\t\t\t\t 4.Queue");
	            System.out.println ("\t\t\t\t\t 5.DeQueue");
	            System.out.println("\t\t\t\t\t 6.Exit");
	            System.out.println (" ");

	            choice = myInput.nextInt();
	            switch (choice){
	                case 1:
	                    System.out.println ("\n2) Singly Linked List Menu\n\n");

	                	SingleLinkedList.main(args);
		                    System.out.println("\n-------------------------------------------------\n");
	                    break;
	                case 2:
	                    System.out.println ("\n2) Doubly Linked List Menu\n\n");
	                    DoubleLinkedList.main(args);
	                    System.out.println("\n-------------------------------------------------\n");
	                    break;
	                case 3:
	                    stackone.main(args);	                   
	                    System.out.println("\n-------------------------------------------------\n");
	                    break;
	                case 4:
                        queueone.main(args);
	                    System.out.println("\n-------------------------------------------------\n");
	                    break;
	                case 5:
	                    System.out.println ("\n2) DeQueue Menu \n\n");
	                    
	                    
	                    System.out.println("\n-------------------------------------------------\n");
	                    break;
	                case 6 :
	                    System.out.println ("\nGoodBye!\n\n");
	                    System.exit(0);
	                    System.out.println ("\n-------------------------------------------------\n");
	                default:
	            }
	        }
	    }

	}
