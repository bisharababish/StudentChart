package Lists;

public class stack2 {
public Object a[];
public int top;


public stack2(int n) {
	a = new Object[n];
	top = -1;
}
public void push(Object obj) {
	if (top== a.length-1)
	{
		System.out.println("Stack is full");
		return;
	}
	top ++;
	a[top] = obj;
}
public Object pop() {
if(isEmpty()) {
	System.out.println("Stack is empty");
	return null;
}
Object item= a[top];
top --;
return item;
}
public Object peek() {
	if(isEmpty()) return null;
	return a [top];
}
public int size() {
	return (top+1);
}
public boolean isEmpty() {
	return (top==-1);
}
}
