import java.util.NoSuchElementException;

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

    public String toString() {
	String out = "[ ";
	for (int i = 0; i < size; i++) {
	    out += data[(start + i) % data.length] + " ";
	}
	return out + "]";
    }

    public void addFirst(E value) {
	if (size == data.length)
	    resize(data.length * 2);
	start = (data.length + start - 1) % data.length;
	data[start] = value;
	size += 1;
    }

    public void addLast(E value) {
	if (size == data.length)
	    resize(data.length * 2);
	data[(start + size) % data.length] = value;
	size += 1;
    }

    @SuppressWarnings("unchecked")
    public E removeFirst() throws NoSuchElementException {
	checkEmpty();
	if (size == data.length / 4)
	    resize(data.length / 2);
	start = (data.length + start + 1) % data.length;
	size -= 1;
	return (E) data[(data.length + start - 1) % data.length];
    }

    @SuppressWarnings("unchecked")
    public E removeLast() {
	checkEmpty();
	if (size == data.length / 4)
	    resize(data.length / 2);
	size -= 1;
	return (E) data[(start + size) % data.length];
    }

    @SuppressWarnings("unchecked")
    public E getFirst() {
	checkEmpty();
	return (E) data[start];
    }

    @SuppressWarnings("unchecked")
    public E getLast() {
	checkEmpty();
	return (E) data[(start + size - 1) % data.length];
    }



    private void checkEmpty() throws NoSuchElementException {
	if (size == 0)
	    throw new NoSuchElementException();
    }

    private void resize(int cap) {
	Object[] temp = new Object[cap];
	for (int i = 0; i < size; i++) {
	    temp[i] = data[(start + i) % data.length];
	}
	data = temp;
	start = 0;
    }
}