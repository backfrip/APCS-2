import java.util.NoSuchElementException;

public class Frontier<E> {
    private Object[] data;
    private int[] prio;
    private int start, size;
    private boolean priority;

    public Frontier(boolean p, int cap) {
	if (cap <= 0)
	    cap = 1;
	data = new Object[cap];
	prio = new int[cap];
	start = 0;
	size = 0;
	priority = p;
    }

    public Frontier(boolean p) {
	this(p, 10000);
    }

    public Frontier() {
	this(false);
    }

    public String toString() {
	String out = "[ ";
	for (int i = 0; i < size; i++)
	    out += data[(start + i) % data.length] + " ";
	if (priority) {
	    out += "]\n[ ";
	    for (int i = 0; i < size; i++)
		out += prio[(start + i) % data.length] + " ";
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

    public void addFirst(E value, int p) {
	if (!priority)
	    throw new RuntimeException("This is not a priority queue!");
	addFirst(value);
	prio[start] = p;
    }

    public void addLast(E value) {
	if (size == data.length)
	    resize(data.length * 2);
	data[(start + size) % data.length] = value;
	size += 1;
    }

    public void addLast(E value, int p) {
	if (!priority)
	    throw new RuntimeException("This is not a priority queue!");
	addLast(value);
	prio[(start + size - 1) % data.length] = p;
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

    @SuppressWarnings("unchecked")
    public E removeLeast() {
	if (!priority)
	    throw new RuntimeException("This is not a priority queue!");
	checkEmpty();
	int min = Integer.MAX_VALUE, index = 0;
	for (int i = 0; i < size; i++) {
	    if (prio[(start + i) % data.length] < min) {
		index = (start + i) % data.length;
		min = prio[index];
	    }
	}
	E hold = (E) data[index];
	data[index] = data[start];
	prio[index] = prio[start];
	start = (data.length + start + 1) % data.length;
	size -= 1;
	return hold;
    }

    @SuppressWarnings("unchecked")
    public E removeGreatest() {
	if (!priority)
	    throw new RuntimeException("This is not a priority queue!");
	checkEmpty();
	int max = Integer.MIN_VALUE, index = 0;
	for (int i = 0; i < size; i++) {
	    if (prio[(start + i) % data.length] > max) {
		index = (start + i) % data.length;
		max = prio[index];
	    }
	}
	E hold = (E) data[index];
	data[index] = data[start];
	prio[index] = prio[start];
	start = (data.length + start + 1) % data.length;
	size -= 1;
	return hold;
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
	if (priority) {
	    int[] tempo = new int[cap];
	    for (int i = 0; i < size; i++) {
		tempo[i] = prio[(start + i) % prio.length];
	    }
	    prio = tempo;
	}
	start = 0;
    }
}
