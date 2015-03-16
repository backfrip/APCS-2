public class LNode<T> {
    private T value;
    private LNode<T> next;
    
    public LNode() {
	// Do nothing
    }
    
    public LNode(T val) {
	value = val;
    }
    
    public LNode(T val, LNode<T> gnu) {
	this(val);
	next = gnu;
    }
    
    public void setValue(T val) {
	value = val;
    }
    
    public T getValue() {
	return value;
    }
    
    public void setNext(LNode<T> gnu) {
	next = gnu;
    }
    
    public LNode<T> getNext() {
	return next;
    }
}