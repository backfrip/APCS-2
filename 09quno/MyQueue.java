public class MyQueue<E> extends MyLinkedList<E> {
    public boolean enqueue(E value) {
	add(value);
	return true;
    }
    
    public E dequeue() {
	return remove();
    }
}