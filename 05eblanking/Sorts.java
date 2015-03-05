import java.util.Arrays;
import java.util.Random;

public class Sorts {
    public static void mergesort(int[] data) {
	if (data.length < 2)
	    return;

	int[] a = new int[data.length / 2];
	int[] b = new int[data.length - a.length];

	int i = 0;
	while (i < data.length) {
	    if (i < a.length)
		a[i] = data[i];
	    else
		b[i - a.length] = data[i];
	    i++;
	}

	mergesort(a);
	mergesort(b);

	i = 0;
	int ai = 0, bi = 0;
	while (i < data.length) {
	    if (ai < a.length && bi < b.length) {
		if (a[ai] <= b[bi]) {
		    // System.out.println("check1 " + ai + " " + bi + " " + i);
		    data[i] = a[ai];
		    ai++;
		} else {
		    data[i] = b[bi];
		    bi++;
		}
	    } else if (ai >= a.length) {
		// System.out.println("check2 " + ai + " " + bi + " " + i);
		data[i] = b[bi];
		bi++;
	    } else {
		data[i] = a[ai];
		ai++;
	    }
	    i++;
	}
    }

    public static void main(String[] args) {
	Random geoff = new Random();
	
	int[] a = new int[100000000];
	for (int i = 0; i < a.length; i++)
	    a[i] = geoff.nextInt(19) - 9;
	//pA(a);
	nL("Sorting unvaried random array w/ 100000000 elems");
	mergesort(a);
	//pA(a);
	nL();
	
	int[] b = new int[100000000];
	for (int i = 0; i < b.length; i++)
	    b[i] = geoff.nextInt(19999) - 9999;
	//pA(b);
	nL("Sorting varied random array w/ 100000000 elems");
	mergesort(b);
	//pA(b);
	nL();
	
	int[] c = new int[100000000];
	for (int i = 0; i < c.length; i++)
	    c[i] = i;
	//pA(c);
	nL("Sorting ordered array w/ 100000000 elems");
	mergesort(c);
	//pA(c);
	nL();
	
	int[] d = new int[100000000];
	for (int i = 0; i < d.length; i++)
	    d[i] = d.length - i - 1;
	//pA(d);
	nL("Sorting reverse ordered array w/ 100000000 elems");
	mergesort(d);
	//pA(d);
	nL();
    }
    
    static void pA(int[] thing) {
	System.out.println(Arrays.toString(thing));
    }
    
    static void nL(String stuff) {
	System.out.println(stuff);
    }
    
    static void nL() {
	nL("");
    }
}