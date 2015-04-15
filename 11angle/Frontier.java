public class Frontier<E> {
    private Object[] data;
    private int[] priority;
    private int start, size;
    private boolean x;

    public Frontier(int cap) {
	front = new int[cap][2];
	start = 0;
	size = 0;
    }

    public Frontier() {
	this(10000);
    }
    
    public String toString() {
	String out = "[ ";
	for (int i = 0; i < size; i++) {
	    out += data[(start + i) % data.length] + " ";
	}
	return out + "]";
    }
}
