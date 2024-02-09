package MenuLists;

import java.io.*;
import java.util.*;


public class queueone {
    public static void main(String[] args) throws IOException {
    	int choice = 1;
    	Queue Process = new Queue();  
    	while (choice != 99) {
    		System.out.print ("\n\t\t\t\tStack Main Menu \n\n");
    		System.out.println ("\t\t\t\t1.Enqueue a Number " + "\n\t\t\t\t2.DeQueue a Number"+ " \n\t\t\t\t3.The First Element "+ "\n\t\t\t\t99 Main Menu");
    		System.out.println("\n\t\t\t\tEnter Your Choice:");
    		System.out.println("\n \n");
    		Scanner mydata = new Scanner(System.in);
    		choice = mydata.nextInt();
        
    		switch (choice) {        
    		case 1:
    			Process.Insert();
    			System.out.println("\n-------------------------------------------------\n");
    			break;
            case 2: 
            	Process.Remove();
                System.out.println("\n-------------------------------------------------\n");
                break;
            case 3: 
            	Process.First();
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
    static class Queue{
    	Node head = null;
    	public void Insert() {
    		System.out.println ("\nEnter A Number To Insert: ");
        	Scanner InputR = new Scanner(System.in);
        	int R =InputR.nextInt();
        	Node newhead = new Node(R);
        	newhead.next = head;
        	head = newhead;
        	System.out.println("\n");
        	System.out.println("The Queue:");
        	Node j = head;
            while (j != null) { 
                System.out.print(j.data + " "); 
                j = j.next; 
            } 
            System.out.println("\n");
            	
    	}
    	public void Remove() {
        	Node de = head;
    		if(de == null) {
    			System.out.print("Queue is Empty");
    		}else{
    		Node temp9 = head;
    	    while(temp9.next.next != null) {
    	    	temp9 = temp9.next;
    	    }
    	    temp9.next = null;
        	System.out.println("\n");
        	System.out.println("The List:");
            while (de != null) { 
                System.out.print(de.data + " "); 
                de = de.next; 
            } 
            System.out.println("\n");
    		}
    	}

    	public void First() {
        	Node fimx = head;
        	int max = head.data;
        	while (fimx != null) {
        		if(max < fimx.data) {
        			max = fimx.data;
        		}
        		
        		fimx = fimx.next;
        	}	
        	System.out.println("\n");
        	System.out.println ("First Value Stored In the Queue is:");
            System.out.println ("First = " + max);	                
            System.out.println("\n");
        	}
    }}
