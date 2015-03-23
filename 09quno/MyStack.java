import java.util.*;

public class MyStack<E> extends MyLinkedList<E> {
    public E push(E value) {
	add(0, value);
	return value;
    }

    public E pop() {
	return remove();
    }

    public E peek() throws NoSuchElementException {
	try {
	    return get(0);
	} catch (IndexOutOfBoundsException e) {
	    throw new NoSuchElementException();
	}
    }
}