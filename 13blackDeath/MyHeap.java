import java.util.ArrayList;

public class MyHeap {
    private int count;
    private ArrayList<Integer> data;
    private boolean max;

    public MyHeap() {
	this(true);
    }

    public MyHeap(boolean isMax) {
	max = isMax;
	count = 0;
	data = new ArrayList<Integer>();
    }

    public String toString() {
	String out = "[ ";
	for (int i = 1; i < count; i++) {
	    out += data.get(i) + ", ";
	}
	return out + data.get(count) + " ]";
    }

    public void add(int val) {
	count += 1;
	data.set(count, val);
	for (int i = count; compare(data.get(i), data.get(i / 2))); i = i / 2) {
	    // Do... nothing? Think about it for a sec...
	}
    }

    private boolean compare(Integer one, Integer two) {
	if (max)
	    return one > two;
	else
	    return one < two;
    }

    public static void main(String[] arg) {
	MyHeap sickPeople = new MyHeap();
	System.out.println(sickPeople);
    }

}
