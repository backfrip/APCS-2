import java.util.*;

public class Sorts {
    private static void partition(int[] ary, int start, int end) {
	if (end - start < 1)
	    return;

	// printFrag("", ary, start, end, " w/ pivot ");

	int h;
	int pivot = start + (int) (Math.random() * (end - start + 1));

	// System.out.print(ary[pivot]);

	h = ary[pivot];
	ary[pivot] = ary[end];
	ary[end] = h;

	int si = start;
	int ei = end - 1;
	while (si < ei) {
	    if (ary[si] <= ary[end]) {
		si++;
	    } else {
		h = ary[si];
		ary[si] = ary[ei];
		ary[ei] = h;
		ei--;
	    }
	}

	if (ary[si] > ary[end]) {
	    pivot = si;
	    h = ary[pivot];
	    ary[pivot] = ary[end];
	    ary[end] = h;
	} else {
	    pivot = si + 1;
	    h = ary[pivot];
	    ary[pivot] = ary[end];
	    ary[end] = h;
	}

	// printFrag(" -> ", ary, start, end, "\n");

	partition(ary, start, pivot - 1);
	partition(ary, pivot + 1, end);


    }

    public static void quicksort(int[] ary) {
	partition(ary, 0, ary.length - 1);
    }

    // main
    public static void main(String[] args) {
	int[] a = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
	quicksort(a);
	System.out.println(Arrays.toString(a));

	int[] b = { 4, 8, 1, 5, 2, 3, 7, 0, 9, 6 };
	quicksort(b);
	System.out.println(Arrays.toString(b));

	int[] c = new int[100000];
	for (int i = 0; i < c.length; i++) {
	    c[i] = (int)(Math.random() * 10);
	}
	quicksort(c);
    }

    private static void printFrag(String pre, int[] ary, int start, int end,
	    String post) {
	System.out.print(pre + "[");
	for (int i = start; i < end; i++) {
	    System.out.print(ary[i] + ", ");
	}
	System.out.print(ary[end] + "]" + post);
    }
}