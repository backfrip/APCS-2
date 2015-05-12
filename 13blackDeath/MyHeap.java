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
	count = 3;
	data = new ArrayList<Integer>();
	data.add(0);
	data.add(1);
	data.add(2);
	data.add(3);
    }
    
    public String toString() {
	String out = "[ ";
	for (int i = 1; i < count; i++) {
	    out += data.get(i) + ", ";
	}
	return out + data.get(count) + " ]";
    }
    
    public static void main(String[]arg) {
	MyHeap sickPeople = new MyHeap();
	System.out.println(sickPeople);
    }

}
