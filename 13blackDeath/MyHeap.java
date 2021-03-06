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
	data.add(0);
    }

    /*
     * public String toString() { String out = "[ "; for (int i = 1; i < count;
     * i++) { out += data.get(i) + ", "; } return out + data.get(count) + " ]";
     * }
     */

    public String toString() {
	String out = data.get(1) + "\n";
	int t = 4;
	for (int i = 2; i <= count; i++) {
	    if (i == t) {
		out += "\n";
		t *= 2;
	    }
	    out += data.get(i) + " ";
	}
	return out + "\n";
    }

    public String rawString() {
	return data.toString();
    }

    public void add(int val) {
	count++;
	data.add(count, val);
	for (int i = count; compare(data.get(i), data.get(i / 2)) && i > 1; i = i / 2) {
	    int t = data.get(i);
	    data.set(i, data.get(i / 2));
	    data.set(i / 2, t);
	}
    }

    public int remove() {
	int r = data.get(1);
	data.set(1, data.remove(count));
	count--;
	// System.out.println("count = " + count);
	for (int i = 2; i < count + 1
		&& (data.get(i / 2) < data.get(i) || data.get(i / 2) < data
			.get(i + 1));) {
	    int s = data.get(i / 2);
	    // System.out.println("i = " + i);
	    // System.out.println("s = " + s);
	    if (count == i || data.get(i) > data.get(i + 1)) {
		data.set(i / 2, data.get(i));
		data.set(i, s);
		i *= 2;
	    } else {
		data.set(i / 2, data.get(i + 1));
		data.set(i + 1, s);
		i = (i + 1) * 2;
	    }
	    // System.out.println(i < count + 1);
	}
	return r;
    }

    private boolean compare(Integer one, Integer two) {
	if (max)
	    return one > two;
	else
	    return one < two;
    }

    public static void main(String[] arg) {
	MyHeap sickPeople = new MyHeap();
	sickPeople.add(31);
	sickPeople.add(0);
	sickPeople.add(1);
	sickPeople.add(2);
	sickPeople.add(-23);
	sickPeople.add(3);
	sickPeople.add(4);
	sickPeople.add(30);
	sickPeople.add(-1);
	System.out.println(sickPeople);
	System.out.println(sickPeople.rawString() + "\n");
	System.out.println(sickPeople.remove());
	System.out.println(sickPeople.remove());
	System.out.println(sickPeople.remove());
	System.out.println(sickPeople.remove());
	System.out.println("\n" + sickPeople);
	System.out.println(sickPeople.rawString());
    }
}
