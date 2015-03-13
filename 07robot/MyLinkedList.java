import java.util.*;

public class MyLinkedList {
    private LNode head, tail;
    private int size;

    public MyLinkedList() {
	head = new LNode();
	tail = head;
	size = 0;
    }


    public String toString() {
	String out = "[";
	LNode temp = head.getNext();
	for (int i = 0; i < size - 1; i++) {
	    out += temp.getValue() + ", ";
	    temp = temp.getNext();
	}
	out += temp.getValue() + "]";
	return out;
    }



    public int size() {
	return size;
    }



    public boolean add(int value) {
	LNode temp = head;
	while (temp.getNext() != null) {
	    temp = temp.getNext();
	}
	tail = new LNode(value);
	temp.setNext(tail);
	size++;
	return true;
    }

    public void add(int index, int value) throws IndexOutOfBoundsException {
	inBounds(index);
	LNode temp = head;
	for (int i = 0; i < index; i++) {
	    temp = temp.getNext();
	}
	temp.setNext(new LNode(value, temp.getNext()));
	size++;
    }



    public int remove() throws NoSuchElementException {
	LNode out;
	if (size > 0)
	    out = head.getNext();
	else
	    throw new NoSuchElementException();
	head.setNext(out.getNext());
	size--;
	return out.getValue();
    }
    
    public int remove(int index) throws IndexOutOfBoundsException {
	return index;
    }
    
    

    private void inBounds(int index) throws IndexOutOfBoundsException {
	if (index < 0 || index > size)
	    throw new IndexOutOfBoundsException();
    }
}