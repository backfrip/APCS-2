public class LNode {
    private int value;
    private LNode next;
    
    public LNode() {
	// Do nothing
    }
    
    public LNode(int val) {
	value = val;
    }
    
    public LNode(int val, LNode gnu) {
	this(val);
	next = gnu;
    }
    
    public void setValue(int val) {
	value = val;
    }
    
    public int getValue() {
	return value;
    }
    
    public void setNext(LNode gnu) {
	next = gnu;
    }
    
    public LNode getNext() {
	return next;
    }
}