public class Driver {
    public static void main(String[] args) {
	MyQueue<String> q = new MyQueue<String>();
	q.enqueue("one");
	System.out.println(q.dequeue());

	MyStack<String> uno = new MyStack<String>();
	uno.push("test");
	System.out.println(uno.peek());
	System.out.println(uno.pop());
    }
}