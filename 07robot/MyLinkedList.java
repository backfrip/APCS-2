public class MyLinkedList {
    private LNode head, tail;
    private int size;
    
    public MyLinkedList() {
	head = new LNode();
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

    public int get(int index) {
	return 0;
    }

    public boolean add(int value) {
	LNode temp = head;
	while (temp.getNext() != null) {
	    temp = temp.getNext();
	}
	temp.setNext(new LNode(value));
	size++;
	return true;
    }
    
    public boolean add(int index, int value) throws IndexOutOfBoundsException {
	inBounds(index);
	return true;
    }
    
    
    
    private void inBounds(int index) throws IndexOutOfBoundsException {
	if (index < 0 || index > size)
	    throw new IndexOutOfBoundsException();
    }
}