public class MyDeque<E> {
    private Object[]data;
    private int start, size;
    
    public MyDeque(int capacity) {
	start = 0;
	size = 0;
	data = new Object[capacity];
    }
    
    public MyDeque() {
	this(10);
    }
    
    // temp method
    public String toString() {
	String out = "[ ";
	for (Object val : data) {
	    out += val + " ";
	}
	return out + "]";
    }
    
    public void addFirst(E value) {
	if (size == data.length)
	    expand();
	if (start == 0)
	    start = data.length - 1;
	else
	    start -= 1;
	data[start] = value;
    }
    
    private void expand() {
	Object[]temp = new Object[data.length * 2];
	for (int i = 0; i < size; i++) {
	    temp[i] = data[(start + i) % size];
	}
	data = temp;
	size *= 2;
	start = 0;
    }
}