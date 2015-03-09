import java.util.*;

public class Sorts {
    private static void partition(int[] ary, int start, int end) {
	if (ary.length < 2)
	    return;
	
	System.out.println(Arrays.toString(ary));
	
	int h;
	int pivot = ary[start + (int)(Math.random() * (end - start + 1))];
	
	System.out.println("Pivot: " + ary[pivot]);
	
	h = ary[pivot];
	ary[pivot] = ary[end];
	ary[end] = h;
	
	System.out.println(Arrays.toString(ary));
	
	
	int si = start;
	int ei = end - 1;
	int c = 0;
	while (si != ei) {
	    if (ary[c] <= ary[end]) {
		//System.out.println("Moving " + ary[c] + " to the left, swapping with " + ary[si]);
		h = ary[c];
		ary[c] = ary[si];
		ary[si] = h;
		si++;
	    } else if (ary[c] > ary[end]) {
		System.out.println("Moving " + ary[c] + " to the right, swapping with " + ary[ei]);
		h = ary[c];
		ary[c] = ary[ei];
		ary[ei] = h;
		ei--;
	    }
	    c++;
	}
	
	//partition(ary, start, pivot - 1);
	//partition(ary, pivot + 1, end);

    }

    public static void quicksort(int[] ary) {
	partition(ary, 0, ary.length - 1);
    }

    // main
    public static void main(String[] args) {
	int[] a = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
	quicksort(a);
    }
}