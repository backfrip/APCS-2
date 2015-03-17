import java.util.*;

public class MyLinkedList<E> implements Iterable<E> {
    private LNode<E> head, tail;
    private int size;

    public MyLinkedList() {
	head = new LNode<E>();
	tail = head;
	size = 0;
    }


    // The toString()
    public String toString() {
	if (size == 0)
	    return "[]";
	String out = "[";
	LNode<E> temp = head.getNext();
	for (int i = 0; i < size - 1; i++) {
	    out += temp.getValue() + ", ";
	    temp = temp.getNext();
	}
	out += temp.getValue() + "]";
	return out;
    }
    
    // The name()
    public String name() {
	return "stringham.eric";
    }



    // Alphabetically sorted class methods
    public boolean add(E value) {
	LNode<E> temp = head;
	while (temp.getNext() != null) {
	    temp = temp.getNext();
	}
	tail = new LNode<E>(value);
	temp.setNext(tail);
	size++;
	return true;
    }

    public void add(int index, E value) throws IndexOutOfBoundsException {
	checkBoundsA(index);
	LNode<E> temp = head;
	for (int i = 0; i < index; i++) {
	    temp = temp.getNext();
	}
	temp.setNext(new LNode<E>(value, temp.getNext()));
	if (index == size - 1)
	    tail = temp.getNext();
	size++;
    }

    public void clear() {
	head.setNext(null);
	tail = head;
	size = 0;
    }

    public boolean contains(Object o) {
	LNode<E> temp = head;
	for (int i = 0; i < size; i++) {
	    temp = temp.getNext();
	    if (temp.getValue().equals(0))
		return true;
	}
	return false;
    }
    
    public E element() throws NoSuchElementException {
	return getFirst();
    }
    
    public E get(int index) {
	checkBoundsB(index);
	LNode<E> temp = head.getNext();
	for (int i = 0; i < index; i++) {
	    temp = temp.getNext();
	}
	return temp.getValue();
    }
    
    public E getFirst() throws NoSuchElementException {
	checkEmpty();
	return head.getNext().getValue();
    }
    
    public E getLast() throws NoSuchElementException {
	checkEmpty();
	return tail.getValue();
    }
    
    public int indexOf(Object o) {
	LNode<E> temp = head.getNext();
	for (int i = 0; i < size; i++) {
	    if (temp.getValue().equals(o))
		return i;
	    temp = temp.getNext();
	}
	return -1;
    }
    
    public E remove() throws NoSuchElementException {
	checkEmpty();
	E out = head.getNext().getValue();
	head.setNext(head.getNext().getNext());
	if (size == 1)
	    tail = head;
	size--;
	return out;
    }

    public E remove(int index) throws IndexOutOfBoundsException {
	checkBoundsB(index);
	LNode<E> temp = head;
	for (int i = 0; i < index; i++) {
	    temp = temp.getNext();
	}
	if (index == size - 1)
	    tail = temp;
	E out = temp.getNext().getValue();
	temp.setNext(temp.getNext().getNext());
	size--;
	return out;
    }
    
    public boolean remove(Object o) throws NoSuchElementException {
	checkEmpty();
	LNode<E> temp = head;
	for (int i = 0; i < size; i++) {
	    if (temp.getNext().getValue().equals(o)) {
		if (i == size - 1)
		    tail = temp;
		temp.setNext(temp.getNext().getNext());
		size--;
		return true;
	    }
	    temp = temp.getNext();
	}
	return false;
    }
    
    public boolean removeFirst() throws NoSuchElementException {
	remove();
	return true;
    }
    
    public boolean removeLast() throws NoSuchElementException {
	checkEmpty();
	remove(size - 1);
	return true;
    }
    
    public E set (int index, E value) {
	checkBoundsB(index);
	LNode<E> temp = head.getNext();
	for (int i = 0; i < index; i++) {
	    temp = temp.getNext();
	}
	temp.setValue(value);
	return value;
    }

    public int size() {
	return size;
    }



    // Index check helpers
    private void checkBoundsA(int index) throws IndexOutOfBoundsException {
	if (index < 0 || index > size)
	    throw new IndexOutOfBoundsException();
    }
    
    private void checkBoundsB(int index) throws IndexOutOfBoundsException {
	if (index < 0 || index >= size)
	    throw new IndexOutOfBoundsException();
    }
    
    private void checkEmpty() throws NoSuchElementException {
	if (size == 0)
	    throw new NoSuchElementException();
    }



    // Iterable implementation
    // NOTE: Included for convenience. Class methods do not use enhanced for
    // loops in order to preserve whatever small amount of speed might be lost
    // in accessing an Iterator. Primarily for large data sets.
    @Override
    public Iterator<E> iterator() {
	return new Iterator<E>() {
	    private LNode<E> temp = head.getNext();

	    @Override
	    public boolean hasNext() {
		return size != 0 && temp != null;
	    }

	    @Override
	    public E next() {
		if (!hasNext())
		    throw new NoSuchElementException();
		E h = temp.getValue();
		temp = temp.getNext();
		return h;
	    }

	    @Override
	    public void remove() {
		throw new UnsupportedOperationException();
	    }
	};
    }

}