public class MyDeque<E> {
    private Object[] data;
    private int start, size;

    public MyDeque(int cap) {
	data = new Object[cap];
	start = 0;
	size = 0;
    }

    public MyDeque() {
	this(10000);
    }

    // temp function
    public String toString() {
	String out = "[ ";
	for (Object obj : data) {
	    out += obj + " ";
	}
	return out + "]";
    }

    public void addFirst(E value) {
	if (size == data.length)
	    expand();
	start = (data.length + start - 1) % data.length;
	data[start] = value;
	size += 1;
    }

    public void addLast(E value) {
	if (size == data.length)
	    expand();
	data[(start + size) % data.length] = value;
	size += 1;
    }

    public E removeFirst() {
	if (size == data.length / 4)
	    contract();
	E temp = (E) data[start];
	data[start] = null;
	start = (data.length + start + 1) % data.length;
	size -= 1;
	return temp;
    }



    private void expand() {
	Object[] temp = new Object[data.length * 2];
	for (int i = 0; i < data.length; i++) {
	    temp[i] = data[(start + i) % data.length];
	}
	data = temp;
	start = 0;
    }

    private void contract() {
	Object[] temp = new Object[data.length / 4];
	for (int i = 0; i < temp.length; i++) {
	    temp[i] = data[(start + i) % data.length];
	}
	data = temp;
	start = 0;
    }
}