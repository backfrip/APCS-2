public class MyDeque {
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
}