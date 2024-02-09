package MenuLists;
import java.io.*;
import java.util.*;
public class stackone {


    public static void main(String[] args) throws IOException {
    	int choice = 1;
    	idk Process = new idk();  
    	while (choice != 99) {
    		System.out.print ("\n\t\t\t\tStack Main Menu \n\n");
    		System.out.println ("\t\t\t\t1.Push a Number " + "\n\t\t\t\t2.Pop a Number"+ " \n\t\t\t\t3.The Top Element "+ "\n\t\t\t\t99 Main Menu");
    		System.out.println("\n\t\t\t\tEnter Your Choice:");
    		System.out.println("\n \n");
    		Scanner mydata = new Scanner(System.in);
    		choice = mydata.nextInt();
        
    		switch (choice) {        
    		case 1:
    			Process.push();
    			System.out.println("\n-------------------------------------------------\n");
    			break;
            case 2: 
            	Process.pop();
                System.out.println("\n-------------------------------------------------\n");
                break;
            case 3: 
            	Process.Top();
                System.out.println("\n-------------------------------------------------\n");
                break;
            default:    
                break;
                }
    		}  
    	}
    static class Node { 
    	int data; 
        Node next;
        Node head = null;
        Node(int d){
        	data = d; 
        	next = null; 
        	}  
        } 
    static class idk{
    	Node head = null;
    	public void push() {
    		System.out.println ("\nEnter A Number To Push: ");
        	Scanner InputR = new Scanner(System.in);
        	int R =InputR.nextInt();
        	Node newhead = new Node(R);
        	newhead.next = head;
        	head = newhead;
        	System.out.println("\n");
        	System.out.println("The Stack:");
        	Node j = head;
            while (j != null) { 
                System.out.print(j.data + " "); 
                j = j.next; 
            } 
            System.out.println("\n");
            	
    	}
    	public void pop() {
        	Node j = head;
    		if(j == null) {
	            System.out.println("\nQueue is Empty!");	    
	            }else {
            Node tempde = head;
            head = head.next;
        	System.out.println("\n");
        	System.out.println("The Stack:");
            while (j != null) { 
                System.out.print(j.data + " "); 
                j = j.next; 
            } 
            System.out.println("\n");	    
	            }
    	}

    	public void Top() {
        	Node fimx = head;
        	int max = head.data;
        	while (fimx != null) {
        		if(max < fimx.data) {
        			max = fimx.data;
        		}
        		
        		fimx = fimx.next;
        	}	
        	System.out.println("\n");
        	System.out.println ("Top Value Stored In the Stack is:");
            System.out.println ("Top = " + max);	                
            System.out.println("\n");
        	}
    	}
    }


