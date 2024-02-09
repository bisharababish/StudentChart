package Lists;


public class LinkedList {
	
	class Node{
		int data ;
		Node next;
		Node (int data){
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	Node tail= null;
	
	void addNode(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head= newnode;
			tail = newnode;
		}
		else {
			tail.next = newnode;
			tail= newnode;
		}
	}
	void displayNode() {
		Node current = head;
		if (head == null) {
			System.out.println("Empty");
			return;
		}
		System.out.println("Nodes: ");
		while(current != null) {
			System.out.println(current.data + "");
			current = current.next;
			
		}
		System.out.println();
	}
	
	int CountNodes() {
		int count =0;
		Node CountNodes = head;
		while (CountNodes !=null) {
			count++;
			CountNodes= CountNodes.next;
			
		}
		return count;
	}
	
	public static void main (String[] args) {
		LinkedList s = new LinkedList();
		s.addNode(1);
		s.addNode(2);
		s.addNode(3);
		s.addNode(4);
s.displayNode();
System.out.println("Total Nodes : " + s.CountNodes());
		
	}
	
	
	
	

}
