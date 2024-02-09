package Lists;

public class Queue {
        private int maxSize;
        private Object que[]; // array
        private int front;
        private int rear;
        private int count;
    
        public Queue(int s) {
            maxSize = s;
            que = new Object[maxSize];
            front = rear = -1;
            count = 0;
        }
    
        public void enqueue(Object item) {
            if (count == maxSize) {
                System.out.println("Queue is full");
                return;
            }
    
            if (rear == maxSize - 1 || rear == -1) {
                que[0] = item;
                rear = 0;
                if (front == -1) {
                    front = 0;
                }
            } else {
                que[++rear] = item;
            }
            count++;
        }
    
        public Object dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
            }
    
            Object temp = que[front];
            que[front] = null;
            if (front == rear) {
                rear = front - 1;
            } else if (front == maxSize - 1)
                front = 0;
            else
                front++;
            count--;
            return temp;
        }
    
        public Object peek() {
            return que[front];
        }
    
        public boolean isEmpty() {
            return (count == 0);
        }
    
        public int size() {
            return count;
        }
    
        public void display() {
            System.out.println("Queue: ");
            for (int i = 0; i < maxSize; i++) {
                System.out.print(que[i] + " ");
            }
        }
    
        public static void main(String[] args) {
            Queue qu = new Queue(5);
            qu.enqueue(1);
            qu.enqueue(2);
            qu.enqueue(3);
            System.out.println(qu.peek() + " = is at the top");
            qu.display();
            System.out.println();
            System.out.println(qu.size() + " = is the size");
            qu.dequeue();
            qu.enqueue("a");
            qu.enqueue("b");
            qu.enqueue("c");
            qu.enqueue("d");
            qu.display();
        }
    }

