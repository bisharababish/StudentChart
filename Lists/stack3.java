package Lists;

public class stack3 {
public static void main (String[] args) {
	stack2 s = new stack2(5);
	Object item;
	s.push("A");
	s.push("B");
	s.push("C");
	System.out.println("Size :   " + s.size());
	item = s.pop();
	System.out.println(item + " Deleted");
	s.push("A1");
	s.push("B2");
	s.push("C3");
	System.out.println(s.pop() + " = Deleted");
	s.push("W");
	s.peek();
	System.out.println( item +  " = is at the top of the stack");
}
}