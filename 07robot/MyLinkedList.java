public class MyLinkedList {
    private LNode head;
    
    public MyLinkedList() {
	super();
    }
    
    public String toString() {
	String out = "[";
	LNode current = head;
	while (current.getNext() != null) {
	    out += current.getValue() + ",";
	}
	return out + "]";
    }
    
    public int get(int index) {
	LNode current = head;
	for (  ; index > 0; index--) {
	    current = current.getNext();
	}
	return current.getValue();
    }
    
    public void add(int value) {
	LNode current = head;
	while (current.getNext() != null) {
	    current = current.getNext();
	}
	current.setNext(new LNode(value));
    }
    
    public static void main(String[]args) {
	LNode chk = new LNode(3);
	System.out.println(chk.getValue());
	System.out.println(chk.getNext());
	
	MyLinkedList fender = new MyLinkedList();
	fender.add(1);
	System.out.println(fender);
    }
}